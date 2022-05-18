public class Test {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5,5);
        Rectangle rectangle3 = new Rectangle(1,1,5,6);

        // тестируем вывод
        System.out.println("Вывод");
        System.out.println("Прямоугольник 1");
        rectangle1.rect_print();
        System.out.println("Прямоугольник 2");
        rectangle2.rect_print();
        System.out.println("Прямоугольник 3");
        rectangle3.rect_print();

        // тестируем метод move
        System.out.println("делаем move для 2 прямоугольника");
        rectangle2.move(2,3);
        rectangle2.rect_print();

        //


    }
}
