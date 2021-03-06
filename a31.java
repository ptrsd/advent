import java.util.stream.Stream;

class A31 {
  public static void main(String[] args) {
    String input = """
      .....##.#.....#........#....##.
      ....#...#...#.#.......#........
      .....##.#......#.......#.......
      ...##.........#...#............
      ........#...#.......#.........#
      ..........#......#..#....#....#
      ..................#..#..#....##
      .....##...#..#..#..#..#.##.....
      ..##.###....#.#.........#......
      #.......#......#......#....##..
      .....#..#.#.......#......#.....
      ............#............#.....
      ...#.#........#........#.#.##.#
      .#..#...#.....#....##..........
      ##..........#...#...#..........
      ...........#...###...#.......##
      .#..#............#........#....
      ##.#..#.....#.......#.#.#......
      .##.....#....#.#.......#.##....
      ..##...........#.......#..##.#.
      ##...#.#........#..#...#...#..#
      .#..#........#.#.......#..#...#
      .##.##.##...#.#............##..
      ..#.#..###......#..#......#....
      .#..#..#.##.#.##.#.#...........
      ...#....#..#.#.#.........#..#..
      ......#.#....##.##......#......
      #....#.##.##....#..#...........
      ...#.#.#.#..#.#..#.#..#.##.....
      #.....#######.###.##.#.#.#.....
      ..#.##.....##......#...#.......
      ..#....#..#...##.#..#..#..#..#.
      .............#.##....#.........
      .#....#.##.....#...............
      .#............#....#...#.##....
      .#.....#.##.###.......#..#.....
      .#...#.........#.......#..#....
      ..#.#..#.##.......##...........
      .....##..#..#..#..#.##..#.....#
      ..##............##...#..#......
      ...#..#....#..##.....##..#.#...
      #.....##....#.#.#...#...#..##.#
      #.#..#.........#.##.#...#.#.#..
      .....#.#....##....#............
      #.......#..#.....##..#...#...#.
      .....#.#...#...#..#......#.....
      ..##....#.#.#.#.#..#...........
      ##..#...#.........#......#...#.
      ..#...#.#.#.#..#.#.##..##......
      #............###.....###.......
      ..........#...#........###.....
      .......##...#...#...#........#.
      .#..#.##.#.....................
      .#..##........##.##...#.......#
      .......##......#.....#......#..
      .##.#.....#......#......#......
      #...##.#.#...#.#...............
      ........#..#...#.##.......#....
      ...................#...#...##..
      ...#...#.........#.....#..#.#..
      .###..#........#..##.##..#.##..
      #...#.....#.....#.....#..#..#..
      ###..#.....#.#.#.#......#....#.
      #........#....##.#...##........
      .#.#..##........##....##.#.#...
      #...#....#.###.#.#.........#...
      ...#...##..###.......#.........
      ......#....#..##..#.....#.#....
      ........#...##...###......##...
      ..........##.#.......##........
      ...#....#......#...##.....#....
      ###.#.....#.#..#..#....#...#..#
      .#.....#.#....#...............#
      ..#....#....####....###....#.#.
      ....##........#..#.##.#....#...
      .......##...#...#..#....####...
      #...##.#......##...#..#........
      ..##..#.##....#.......##.#.#...
      ..#.#...............#...#.#....
      ....#.....#.#.....#.##.......#.
      ...#.#..##.#.#..............##.
      ..#.....#...#.............#.##.
      ##..#.#...#........#..#.....##.
      ...........##...#.#.###...#....
      ...#.#.#..#..................#.
      .#...##.............#...#......
      ..#..#...#.#.......#...#.....#.
      ..##.......#.#.................
      .##..#........###.....#....#.##
      ......#..###.......#....##....#
      ....#.....#.................#..
      ........#...#...#..............
      ...#..#.###.......#..#.#.#.##..
      ..#...#.....#....#.........#...
      ...#.............#........###..
      ......#..............#......#..
      #..#...........#...#..........#
      ...##...#.###..#...#.....#.#...
      ....#..##......#.......##......
      ....#....##.#...#.#..#....#...#
      .#...........#..#....##...#..##
      ..#.#.................###.#...#
      ..#.#.#...##...........#.......
      ..........#..##...#.#..##....##
      ........#........#.##..#.#...#.
      .....#...##.......##......#...#
      ....#...#..#..#.....#..........
      .#..#......#..#..#..###.......#
      .##..........#...#...#.#.....##
      ..#..........#.#.#...###.......
      ....#................#...##....
      .##..#....#..........#.#.#.....
      ..##...#.#........#.....#.##...
      ....####.....#..#.........##..#
      ......#.........#...#..........
      ....#...................#..##..
      .##....#.#.........#....#...#..
      ....##...##.....#..####........
      ..##.#....#.#.......##...#.....
      #...#.#.#...#..#..##.....#.....
      #..................###.....#...
      #.#.....#.......#.#...###.#....
      .#..#....#............#........
      #.#....#..#.#...............#..
      ..#..#..#.............#......#.
      ..#.......##...................
      .#....#.........#....#.#.#..#..
      ....#....#..#...............#..
      ......#..#..##......#.........#
      ..#.##........##......#..#..#.#
      #.....#.#....#.........##...#..
      ###..............#....###...##.
      ....#..##......#.......##......
      ......#...#.##......##....#..#.
      ..........#....#..##.......#..#
      .#..#...##..#...........#..#..#
      .....#....#...#..###...###....#
      .#####..#...#.#.#..#.#.###...##
      ..##............##.#...#.##...#
      .##..#...#...#....##.#..#..##..
      .#....#...#............##..#...
      .#.#......#....#....#..##..##..
      .........#...#.......#.##..#...
      #.........#.....##.....#..#..#.
      ...##.#...#...#..#..#....##..##
      .#............#...#....##......
      ..#...#.##.........#.#......#.#
      ....#.##........#.........#..##
      #.........#......#.#......#..#.
      ........#.#.......#.#........#.
      ..#..........##.#...#..#.#.....
      ..#...#....#...#...#..#.#..#.#.
      .#.........#....#..#####..#....
      #.#....#.#.###...#.............
      ..##...........##......##......
      #.....#..#....#...............#
      ...#.#..#....##......#...##....
      ...#........#.....#...#..#.....
      .#......##.........#......#....
      ..#..###.##...#.#.....#........
      .............#......#..#.......
      ..#...............#.#...#..#..#
      .......#..#...#.#####......#..#
      .........#.....#...............
      ##........#............#.#.....
      .#...#.....#..#..#...#....#...#
      ..#....#....##......##.....#.#.
      #...##..##......#...#....#.....
      ....#.#.#.....###....##.##....#
      ..........##...##.......#......
      ..#.......#...##.#....##.##....
      ....#........................#.
      ...#...#.#.##...#.....#...#..#.
      .#....##..#..#..........##..##.
      .#.....#..#...#.##.....#.......
      .#.##...#.#..#.....##....#...#.
      .##...#........##....#..#......
      .....#........#..........#.#..#
      ....#..##.......#..#.....#.....
      ...........#...#........#.##..#
      .....#..#....#..#.#.....#....##
      .....#....#.##.#..##...........
      ...##.......##.........#.......
      ...............##..#....#.#....
      .......###..#........#..####.##
      .......#.##...#.#....#.####....
      ....#...............#..........
      ##.#.......#.....#......#...#..
      ......##.....#....#.....#..#..#
      .....#...##.............#......
      #.#.##.#.....#..#........#.....
      ......##....#..#........#......
      ............#........#..#.#....
      ##.......#......#...####..#.##.
      ..##..#...#.............#.##...
      .....#..##......#.##......###..
      ............#........#........#
      #.#.#.#...#.#.....#.........#..
      .........#...............#.....
      .............###.#.......#....#
      ###.##..#..#..........#....#...
      #......#...#..#..#.....#.##....
      ............#....#....#..#.....
      ..#.#....#...#......#.#..#..##.
      ...#........................#..
      #.#...#..........#......#.#....
      .........#................#...#
      ##.....#....#........##.......#
      #...##........#...#...........#
      ...#...#..........##.......#.#.
      ..#.#.#....#......##...........
      ...#.#...#.##.#..#.#.##........
      #....##.....###..#.......#.....
      ###.....#.#.#...#..#.........##
      ..#......#..###...#.#.#.....#.#
      .#....#.....#............#..##.
      ....#....##..........#.....##..
      #...........#....#...#..#...##.
      ..#.......#.....#..........#...
      .#..#................#......#..
      ..#......#.#...#..#.#....#....#
      ...#..#...###..#..##....#.#....
      ..#..............#.....#.......
      ...#.#...#.........#.#.........
      ##......##...........##.#.##..#
      ..#..##..#....#.#......#.#...##
      ...#.###....###...#.....#......
      #.#................#......#....
      ..#.....#.....#....##.......#..
      .#.#...............##..#.......
      ...#....#.......#.#.....##..#..
      .........#....#.......#.#...##.
      #....#......##.#.........##...#
      #.............#..##.#.#..##....
      ...#....#..#...#....#.#.#.#...#
      .#....#....#..##.....#.#...###.
      ##............#.#...##.#..#.#..
      ##.#....##.....#..#..###....#..
      ##....#................##......
      ...##..#...#..###....#.....##..
      .#...##......#..#.#.....#...#..
      ..##......##...#.##.......#....
      ......#.....#.....##........#.#
      ##....#...........#............
      #.......#....#..#.##..##.#..#..
      .#....##.#.....#..#..#.........
      .#....#.#.#...#.....##.....#.#.
      .......##.#.#........#......##.
      ##........#.##.......#...#..#..
      ...###..##....#.#....#.#.......
      ......#.......#...##.....#...#.
      ..#......##.#......#.....#.....
      .....#.....###...#.............
      #...#.#...#...#..#......#......
      #.....#.......###.#....###.#...
      ...#.......#....####....##..#..
      #.#.....#....#........#.......#
      .........#.......#......#.#...#
      ..##....#.....##...............
      ..........#..#.#..#......#.....
      ..................##...##.#....
      ........#.......#...#..#.#.#...
      .....#.#..##..#..#.#..#.......#
      .....#........#..#..#....#....#
      ##............#..#..#...#....#.
      .....#....................##..#
      ........##.#....###............
      ##.......#.##................#.
      .....###.#..#..#...#....###.##.
      .#......#.#....#.....##.#......
      ...##......##.........#...#....
      ....####..............#........
      #...#.#..##..##.........##.....
      ......#......#....#..#.........
      #.....#.....#.##...............
      ..#.##..#...##.#.####..#....###
      #..#......#....#.##..##...#.#..
      #....#.......#.....#.....#.#...
      ##.......#.....##...#.....#....
      ...#...##..........#..##..##..#
      .###..#..##...#....#...#..#....
      ......##..###.......###...#....
      ....#...#.#.......#.##...##..##
      #.#......#..##.#.#..#..#..#....
      ......#........#.......#.......
      ..........#.#.....##...........
      ......#..#........#..#.#..###..
      ##..#.............##..#........
      .........#....#.....#.........#
      .....#..##...#..#..##.##......#
      ###..#...........#.......#....#
      ...............#....#.#........
      .##.#...#.#........##....#.....
      .##.###...##..###....#...#...#.
      .##..#....#.#.#...#.#.#.#...#..
      .###.#...#.......#....#..#.....
      ..#..#.#.#.#........#.....##...
      .#.......#.#...#.#...........##
      ...#.....##....#.....##...#....
      ................#.....####...#.
      .#.#......#.......##...#.##....
      .###.........#.#......#..#.#...
      #......#...#....#..##.......#..
      .##..#....#..#...........#...#.
      .#...#.......##........#.##....
      ..#...........#...##...........
      .....##....##......#....#..#...
      #......#.#...#.##.#...##....#..
      #....................#...##...#
      ..#............#........#......
      .............#.........##.....#
      ...#...#......##.#...#...#.#...
      ..#...#.#.................#....
      ....##...#....#...###.##......#
      ...#....#...#..#...#....#.....#
      ...##.#........#..#.........#..
      ..##.....#..##...#.....##...#..
      #.........#.#.#...#......#...#.
      #.#...........#...#..#..#..##..
      ..#..#..##....#..........#.###.
      .....#..#....#.#...#...#..#..#.
      ###.....#..#.................#.
      .#..##.##.#......#....##..#....""";

    String[] lines = input.split(System.getProperty("line.separator"));
    int x = 0, maxX = lines[0].length(), count = 0;
    for (int y = 0; y < lines.length; y++) {
      if (lines[y].charAt(x) == '#') {
        count++;
      }
      x += 3;
      if (x >= maxX) x -= maxX;
    }

    System.out.println(count);
  }
}
