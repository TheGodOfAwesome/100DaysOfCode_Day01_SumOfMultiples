public class Calculate {
    public boolean isMultiple(int i) {
        return (i % 3 == 0) || (i % 5 == 0) ;
    }

    public int getSumOfMultiples(int num1, int num2) {
        return (num1 + num2);
    }

    public int getSumOfMultiples(int range) {

        int total = 0;

        for (int i = 0; i < range; i++) {
            if(isMultiple(i))
                total = getSumOfMultiples(total, i);
        }
        return (total);
    }
}
