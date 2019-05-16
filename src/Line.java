public class Line {

    String name;
    int x;
    int y;
    int lenght;



    int math(){
        if(x > y){
           lenght = x - y;
           return lenght;
        }
        else {
            lenght = y - x;
            return lenght;
        }
    }




}
