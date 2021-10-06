public class ContBancar
{
    private double _sold=700000.0;

    public ContBancar(double sold)
    {
        _sold=sold;
    }
    public void DepozitareSuma(double suma)
    {
        _sold+=suma;
    }
    public void cumpararetir(double suma)
    {
        _sold=_sold-suma;
    }
    public double check_sold()
    {
        return _sold;
    }
}
