using System;

public static class Gigasecond
{
    private const int Giga = 1_000_000_000;
    public static DateTime Add(DateTime moment)
    {
        return moment + new TimeSpan(0,0,Giga);
    }
}