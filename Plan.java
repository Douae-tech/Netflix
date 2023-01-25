package Payment;

import Features.Quality;
import static Features.Quality.HD;
import static Features.Quality.ULTRA_HD;

public class Plan {

    private double cost;
    private int screen_num;
    private int download_devices;
    private Quality quality;

    public Plan(String type) throws InvalidPlanTypeException {
        if (type.equalsIgnoreCase(Plantype.BASIC.name())) {

            this.cost = 65;
            this.screen_num = 1;
            this.download_devices = 1;
            this.quality = HD;
        } else if (type.equalsIgnoreCase(Plantype.STANDARD.name())) {

            this.cost = 95;
            this.screen_num = 2;
            this.download_devices = 2;
            this.quality = HD;
        } else if (type.equalsIgnoreCase(Plantype.PREMIUM.name())) {

            this.cost = 125;
            this.screen_num = 4;
            this.download_devices = 4;
            this.quality = ULTRA_HD;
        } else {
            throw new InvalidPlanTypeException(type);
        }
    }

    public Plan(double cost, int screen_num, int download_devices) {
        this.cost = cost;
        this.screen_num = screen_num;
        this.download_devices = download_devices;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getScreen_num() {
        return screen_num;
    }

    public void setScreen_num(int screen_num) {
        this.screen_num = screen_num;
    }

    public int getDownload_devices() {
        return download_devices;
    }

    public void setDownload_devices(int download_devices) {
        this.download_devices = download_devices;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return ("\nThe cost:" + this.cost + "\nThe number of screens where you can watch: " + this.screen_num + "\nNumber of devices where you can download: " + this.download_devices + "\nAvaialble Quality: " + this.quality);
    }
}
