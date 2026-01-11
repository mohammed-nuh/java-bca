class P28_ThrowKeyword {
    public static void main(String args[]){
        try {
            // throw new ArithmeticException();
            throw new ArithmeticException("error, something went wrong");
        } catch (ArithmeticException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        } 
    }
}