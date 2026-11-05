class Solution {
    public double angleClock(int H, int M) {
        double Ma = 6.0*M;
        double Ha = 30.0*(H%12) + 0.5*M ;
        double d = Math.abs(Ha-Ma);

        return Math.min(d, 360.0-d);
    }
}