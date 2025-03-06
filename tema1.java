public class tema1 {
    public static void main(String[] args) {
        
        if (args.length != 2) {
            System.out.println("Incorrect input");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        int[][] adjacencyMatrix = generateGraph(n, k);
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();

        if (n <= 10) {
            printMatrix(adjacencyMatrix);
        } else {
            System.out.println("Runtime: " + (endTime - startTime) + " milliseconds");
        }

        int m = countEdges(adjacencyMatrix);
        int[] degrees = calculateDegrees(adjacencyMatrix);
        int maxDegree = maxDegree(degrees);
        int minDegree = minDegree(degrees);

        System.out.println("Number of edges: " + m);
        System.out.println("Maximum degree (\u0394): " + maxDegree);
        System.out.println("Minimum degree (\u03B4): " + minDegree);

    
        int sumDegrees = 0;
        for (int degree : degrees) {
            sumDegrees += degree;
        }
        if(sumDegrees == 2*m)
        System.out.println("Checks out");
        else{
            System.out.println("U did sth wrong Rob");
        }


    }


    public static int[][] generateGraph(int n, int k) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                matrix[i][j] = 1;
                matrix[j][i] = 1;
            }
        }

    
        for (int i = k; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.random() < 0.5) { //  50% chance of an edge
                    matrix[i][j] = 1;
                    matrix[j][i] = 1;
                }
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        String result = "";
        for (int[] row : matrix) {
            for (int value : row) {
                if (value == 1) {
                    result += "*"; 
                } else {
                    result += "_"; 
                }
            }
            result += "\n"; 
        }
        System.out.print(result);
    }

   
    public static int countEdges(int[][] matrix) {
        int edges = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    edges++;
                }
            }
        }
        return edges;
    }


    public static int[] calculateDegrees(int[][] matrix) {
        int[] degrees = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    degrees[i]++;
                }
            }
        }
        return degrees;
    }


    public static int maxDegree(int[] degrees) {
        int max = Integer.MIN_VALUE;
        for (int degree : degrees) {
            if (degree > max) {
                max = degree;
            }
        }
        return max;
    }

  
    public static int minDegree(int[] degrees) {
        int min = Integer.MAX_VALUE;
        for (int degree : degrees) {
            if (degree < min) {
                min = degree;
            }
        }
        return min;
    }
}