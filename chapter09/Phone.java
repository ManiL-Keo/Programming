public class Phone {
    final int batteryCapacity = 100;
    int batteryLevel;

    public Phone() {
        this.batteryLevel = batteryCapacity;
    }

    public void displayInfo() {
        System.out.println("バッテリー容量: " + this.batteryCapacity);
        System.out.println("現在の充電量: " + this.batteryLevel);
    }

    public void Use(int use) {
        if (use > this.batteryLevel) {
            System.out.println("足りない");
            return;
        }
        this.batteryLevel -= use;
        System.out.println(use + " 使った！");
    }

    public void Charge(int charge) {
        if (charge > batteryLevel) {
            System.out.println("足りない");
            return;
        } else if (charge + this.batteryLevel > 100) {
            System.out.println("満充電");
            this.batteryLevel = this.batteryCapacity;
        }
        this.batteryLevel += charge;
        System.out.println(charge + " Charged!");
    }

    public void showCurrentCapacity(){
        System.out.println("現在の充電量" + this.batteryLevel);
    }

    
}
