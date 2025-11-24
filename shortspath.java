public class shortspath {
    public static float getShortestPath(String path){
        int x= 0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            // north
            if(dir=='N'){
                y++;
            }
            // south
            else if(dir=='S'){
                y--;
            }
            // east
            else if(dir=='E'){
                x++;
            }
            // west
            else{
                x--;
            }
        }
        int x2= x*x;
        int y2= y*y;
        return (float)Math.sqrt(x2 + y2);
        
    }
    public static void main(String[] args){
        String path="WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
