package saheedPackage;

public class SimpleJavaClass<result> {

    // create a method that collect two numbers
    // create different methods that calculates
    int sum;
    int answer;
    int result;
    int solution;

    //access modifiers are public, private, protected and default

    public void additionMethod(int firstNumber, int secondNumber) {

        // int sum is a local variable to store addition cal.

        sum = firstNumber + secondNumber;
    }

    public int getSum() {
        return sum;
    }

    public void multiplicationMethod(int firstNumber, int secondNumber) {

        answer = firstNumber * secondNumber;

    }
    public int getAnwser() {
        return answer;
    }

    public void divisionMethod(int firstNumber, int secondNumber){
       result = firstNumber/secondNumber;
    }
        public int getResult(){
            return result;
        }

        public void subtractionMethod(int firstNumber, int secondNumber){
        solution = secondNumber - firstNumber;
        }
            public int getSolution(){
                return solution;
            }


    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void setSolution(int solution) {
        this.solution = solution;
    }
}