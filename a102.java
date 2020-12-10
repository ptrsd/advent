import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class a102 {
    record adapter(Long value, Boolean visited) {
    }

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

        Long[] adapters = new Long[lines.length+1];
        for (int i = 1; i < adapters.length; i++) adapters[i] = Long.valueOf(lines[i-1]);
        adapters[0] = 0L;

        Arrays.sort(adapters);
        Long[] paths = new Long[adapters.length];
        for (int i = 0; i < paths.length; i++) paths[i] = 0L;
        paths[0] = 1L;

        for ( int i = 1; i < adapters.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                long l1 = adapters[i] - adapters[j];
                if (l1 <= 3) {
                    paths[i] += paths[j];
                }
            }
        }
        for (int i = 0; i < paths.length; i++) System.out.println(paths[i]);
    }
}
