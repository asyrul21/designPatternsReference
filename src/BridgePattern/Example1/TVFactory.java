package BridgePattern.Example1;

public class TVFactory {
    public TV getTV(String type) throws Exception{
        if (type.equals("LG")) {
            return new LGTV();
        } else if (type.equals("Sony")) {
            return new SonyTV();
        } else {
            throw new Exception("Invalid TV Type");
        }
    }
}
