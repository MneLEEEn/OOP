package lab1;

public class Temperature {
    // Приватные поля (Инкапсуляция)
    private double value;
    private char scale;

    // --- КОНСТРУКТОРЫ ---

    // 1. Дефолтный конструктор (0 градусов Цельсия)
    public Temperature() {
        this.value = 0.0;
        this.scale = 'C';
    }

    // 2. Конструктор для каждого поля (значение или шкала)
    // Если указано только значение -> шкала Цельсия
    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    // Если указана только шкала -> значение 0
    public Temperature(char scale) {
        this.value = 0.0;
        this.scale = scale;
    }

    // 3. Конструктор с двумя параметрами
    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    // --- МЕТОДЫ ПОЛУЧЕНИЯ (Accessors) ---

    // Возвращает температуру в Цельсиях
    public double getCelsius() {
        if (scale == 'C') {
            return value;
        } else {
            // Формула: degreesC = 5(degreesF - 32) / 9
            return 5 * (value - 32) / 9;
        }
    }

    // Возвращает температуру в Фаренгейтах
    public double getFahrenheit() {
        if (scale == 'F') {
            return value;
        } else {
            // Формула: degreesF = (9(degreesC / 5)) + 32
            return (9 * (value / 5)) + 32;
        }
    }

    // Метод для получения шкалы
    public char getScale() {
        return scale;
    }

    // --- МЕТОДЫ ИЗМЕНЕНИЯ (Mutators/Setters) ---

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setBoth(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }
    
    
}

