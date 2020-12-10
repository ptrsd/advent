import java.util.Arrays;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class a101 {
    record res(Long ones, Long threes) {}
    public static void main(String[] args) {
        String input = """
84
60
10
23
126
2
128
63
59
69
127
73
140
55
154
133
36
139
4
70
110
97
153
105
41
106
79
145
35
134
146
148
13
77
49
107
46
138
88
152
83
120
52
114
159
158
53
76
16
28
89
25
42
66
119
3
17
67
94
99
7
56
85
122
18
20
43
160
54
113
29
130
19
135
30
80
116
91
161
115
141
102
37
157
129
34
147
142
151
68
78
24
90
121
123
33
98
1
40
                """;

        String[] lines = input.split("\n");
        TreeSet<Long> xxx = new TreeSet<>(Arrays.asList(lines).stream().map(Long::valueOf).collect(Collectors.toList()));
        res rec = rec(xxx, 0L, new res(0l, 0l));
        System.out.println(rec);
    }

    public static res rec(TreeSet<Long> adapters, Long start, res result) {
        Optional<Long> first = adapters.stream().filter(adp -> adp - start == 1).findFirst();
        if (first.isPresent()) {
            return rec(adapters, first.get(), new res(result.ones + 1, result.threes));
        }

        Optional<Long> sec = adapters.stream().filter(adp -> adp - start == 2).findFirst();
        if (sec.isPresent()) {
            return rec(adapters, sec.get(), result);
        }

        Optional<Long> thr = adapters.stream().filter(adp -> adp - start == 3).findFirst();
        if (thr.isPresent()) {
            return rec(adapters, thr.get(), new res(result.ones, result.threes + 1));
        }

        return result;
    }
}
