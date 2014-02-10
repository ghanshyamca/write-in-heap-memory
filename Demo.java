import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

class Demo {

    public static void main(String[] args) throws IOException{
        byte[] buffer = getBytes();
        printBytes(buffer);
    }

    private static byte[] getBytes() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(45);
        out.flush();
        out.write(90);
        out.flush();
        out.close();
        return out.toByteArray();
    }

    private static void printBytes(byte[] bytes) throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        System.out.println("Bytes contents are:");
        int r = in.read();
        if (-1 != r) do {
            System.out.println(r);
            r = in.read();
        } while (-1 != r);
        in.close();
    }
}