
class Rectangle {
    private int x1;
    private int y1;

    private int x2;
    private int y2;

    public Rectangle() {
        this.x1 = 0;
        this.y1 = 0;

        this.x2 = 0;
        this.y2 = 0;
    }

    public Rectangle(int width, int height) {
        this.x1 = 0;
        this.y1 = 0;

        this.x2 = width;
        this.y2 = height;
    }

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;

        this.x2 = x2;
        this.y2 = y2;
    }

    //вывод
    public void rect_print() {
        System.out.println("(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")");
    }

    //движение
    public void move(int dx, int dy) {
        x1 = x1 + dx;
        x2 = x2 + dx;

        y1 = y1 + dy;
        y2 = y2 + dy;
    }

    // получить длинну
    public int getWidht() {
        return x2 - x1;
    }

    // получить высоту
    public int getHeight() {
        return y2 - y1;
    }

    // получить периметр
    public int getPerimeter() {
        return getWidht() * 2 + getHeight() * 2;
    }

    // получить площадь
    public int getSquareArea() {
        return getWidht() * getHeight();
    }

    // проверка на квадрат
    public boolean ifSquare() {
        return getWidht() == getHeight();
    }
}

