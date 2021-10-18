public class Overloading {
    public void add(int x, int y){
        int res = x+y;
        System.out.println(res);
    }   

    public void add(int x, int y, int z){
        int res = x+y+z;
        System.out.println(res);
    }

    public int add(int x, int y, int z, int w){
        return x+y+z+w;
    }

    public static void main(String args[]) {
        Overloading obj = new Overloading();
        obj.add(12,13);
        obj.add(12,13,14);
        System.out.println(obj.add(12, 13, 14, 15));
    }
}

