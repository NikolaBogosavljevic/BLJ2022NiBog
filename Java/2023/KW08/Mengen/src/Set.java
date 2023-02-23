public class Set implements BaseCollection {
    private int dimension;
    private int count = 0;
    private int[] setElements;

    public Set(int dimension) {
        this.dimension = dimension;
        setElements = new int[dimension];
    }

    @Override
    public int getNumberOfElem() {
        return count;
    }

    @Override
    public boolean isElem(int element) {
        for (int i = 0; i < setElements.length; i++) {
            if (element == setElements[i]) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addElem(int element) {
        if (isElem(element)) {
            return false;
        }

        if (count == dimension) {
            System.out.println("no space mb");
            return false;
        }
        setElements[count] = element;
        count++;
        return true;
    }

    public void union(Set set2) {
        System.out.println("Union");
        Set set3 = new Set(count + set2.count);
        for (int i = 0; i < count; i++){
            set3.addElem(setElements[i]);
        }
        for (int i = 0; i < set2.count; i++){
            set3.addElem(set2.setElements[i]);
        }
        for (int i = 0; i < set3.setElements.length; i++){
            System.out.println(set3.setElements[i]);
        }
    }

    public void intersection(Set set2) {
        System.out.println("Intersection");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < set2.count; j++) {
                if (setElements[i] == set2.setElements[j]) {
                    System.out.println(setElements[i]);
                }
            }
        }
    }

}
