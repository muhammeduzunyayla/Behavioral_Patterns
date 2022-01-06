public class Roman extends Book{

    @Override
    public void kabulet(IBookZiyaretci ziyaretci) {
        ziyaretci.ihracatZiyaretcisi(this);
    }
}
