public class Subnet {
    public int ID;
    public String area;
    public String IP;
    public String RouteTable;

    public Subnet(int ID, String IP, String area) {
        this.ID = ID;
        this.IP = IP;
        this.area = area;
    }
}
