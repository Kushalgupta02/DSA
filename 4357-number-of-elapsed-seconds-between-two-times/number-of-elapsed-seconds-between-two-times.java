class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] parts = startTime.split(":");
        String[] parts2 = endTime.split(":");

        int hours1 = Integer.parseInt(parts[0]);
        int minutes1 = Integer.parseInt(parts[1]);
        int seconds1 = Integer.parseInt(parts[2]);

        int hours2 = Integer.parseInt(parts2[0]);
        int minutes2 = Integer.parseInt(parts2[1]);
        int seconds2 = Integer.parseInt(parts2[2]);

        int totalSeconds1 = (hours1 * 3600) + (minutes1 * 60) + seconds1;
        int totalSeconds2 = (hours2 * 3600) + (minutes2 * 60) + seconds2;

        return Math.abs(totalSeconds1-totalSeconds2);

    }
}