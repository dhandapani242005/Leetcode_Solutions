class ProductOfNumbers {

    ArrayList<Integer> numbers;
        public ProductOfNumbers() {
            numbers = new ArrayList<>();
        }
        public void add(int num) {
            if(num==0) {
                numbers.clear();
                return;
            }
            if(numbers.isEmpty())
                numbers.add(num);
            else
                numbers.add(num * numbers.get(numbers.size() - 1));
        }
        public int getProduct(int k) {
            if(k>numbers.size())
                return 0;
            if(k==numbers.size())
                return numbers.getLast();
            int product = numbers.getLast()/numbers.get(numbers.size() - k-1);
            return product;
        }
}