public class NatGateWay {
    private Integer id;
    private Subnet subnet;

    public NatGateWay(Subnet subnet) {
        this.subnet = subnet;
    }
    public void send(String msg) {
        System.out.println(msg);
    }
}
