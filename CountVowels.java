class CountVowels {
    public static void main(String[] args) {
        String s = "education";
        int count = 0;

        for (char ch : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1)
                count++;
        }

        System.out.println(count);
    }
}
