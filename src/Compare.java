public class Compare {


void comp(Line line1, Line line2){
    if(line1.lenght > line2.lenght){
        System.out.println("Długoć odcinka: " + line1.name + " = " + line1.lenght + ". Zaczyna się w punkcie " +
                line1.x + " a kończy w punkcie " + line1.y);
    }
    else
        System.out.println("Długoć odcinka: " + line2.name + " = " + line2.lenght + ". Zaczyna się w punkcie " +
                line2.x + " a kończy w punkcie " + line2.y);
}


}
