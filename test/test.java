public class test {
    // nCr
    public static int nCr(int n, int r) {
        if (n == r) return 1;
        if (r == 0) return 1;
        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }

    // catalan number
    public static int catalan(int n) {
        if (n == 0) return 1;
        return catalan(n - 1) * (4 * n - 2) / (n + 1);
    }

    // take the integral of a function
    public static double integral(double a, double b, double h, Function f) {
        double sum = 0;
        for (double i = a; i < b; i += h) {
            sum += f.f(i) * h;
        }
        return sum;
    }

    // guess someone's name from their height and weight
    public static String guessName(double height, double weight) {
        if (height < 150) {
            if (weight < 50) return "Tiny";
            if (weight < 100) return "Little";
            if (weight < 150) return "Small";
            if (weight < 200) return "Average";
            if (weight < 250) return "Large";
            if (weight < 300) return "Big";
            if (weight < 350) return "Huge";
            if (weight < 400) return "Giant";
            return "Gigantic";
        } else {
            if (weight < 50) return "Tiny";
            if (weight < 100) return "Little";
            if (weight < 150) return "Small";
            if (weight < 200) return "Average";
            if (weight < 250) return "Large";
            if (weight < 300) return "Big";
            if (weight < 350) return "Huge";
            if (weight < 400) return "Giant";
            return "Gigantic";
        }
    }

    // return google search results for a query
    public static String googleSearch(String query) {
        return "https://www.google.com/search?q=" + query;
    }

    // make a http request to google and return top result for query
    public static String googleSearchTopResult(String query) {
        try {
            Document doc = Jsoup.connect("https://www.google.com/search?q=" + query).get();
            Element first = doc.select("div#search").select("div.g").first();
            return first.select("h3").text();
        } catch (Exception e) {
            return "";
        }
    }
}