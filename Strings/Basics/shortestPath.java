package Basics;

public class shortestPath {
    public static float getShortestPath(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E')
                x++;
            else if (str.charAt(i) == 'W')
                x--;
            else if (str.charAt(i) == 'N')
                y++;
            else
                y--;
        }
        int x2 = x * x;
        int y2 = y * y;

        // since math.sqrt return double so we have to typecast here

        return (float) Math.sqrt(x2 + y2);

    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        float distance = getShortestPath(str);
        System.out.print(distance);
    }
}
