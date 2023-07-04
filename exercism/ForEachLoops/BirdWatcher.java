class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeekCount = { 0, 2, 5, 3, 7, 8, 4 };
        return lastWeekCount;
    }

    public static void main(String[] args) {
        BirdWatcher birdWatcher = new BirdWatcher(new int[] { 0, 2, 5, 3, 7, 8, 4 });
        birdWatcher.incrementTodaysCount();
        System.out.println(birdWatcher.getCountForFirstDays(4));
    }

    public int getToday() {
        return this.birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : this.birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdCount = 0;

        for (int i = 0; i < numberOfDays; i++) {
            if (i >= this.birdsPerDay.length) {
                break;
            }
            birdCount += this.birdsPerDay[i];
        }

        return birdCount;
    }

    public int getBusyDays() {
        int busyDays = 0;

        for (int birds : birdsPerDay) {
            if (birds >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
