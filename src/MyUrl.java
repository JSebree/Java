public class MyUrl
{
    private String mUrl;
    public String addPrefix(String mUrl){
        String prefix;
        if (mUrl.indexOf('?') > -1) {
            prefix = "&";
        }
        else {
            prefix = "?";
        }
        return prefix;
    }
    public MyUrl(String url)
    {
        if (url.indexOf("http://") > -1) {
            mUrl = url;
        }
        else {
            mUrl = "http://" + url;
        }
    }
    public String toString()
    {
        return mUrl;
    }
    public void addArgument(String name, String value)
    {
        mUrl += (addPrefix(mUrl) + urlEncode(name) + "=" + urlEncode(value));
        toString();
    }
    public void addArgument(String name, int ivalue)
    {
        mUrl += (addPrefix(mUrl) + urlEncode(name) + "=" + Integer.toString(ivalue));
        toString();
    }
    public void addArgument(String name, double dvalue)
    {
        mUrl += (addPrefix(mUrl) + urlEncode(name) + "=" + Double.toString(dvalue));
        toString();
    }
    public static String urlEncode(String text)
    {
        String encodedLine, catalog;
        encodedLine = "";
        char position;
        int ind, ref, pos;
        ref = text.length();
        for (ind = 0; ind < ref; ind++) {
            catalog = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_-.*";
            position = text.charAt(ind);
            pos = catalog.indexOf(position);
            if (pos != -1) {
                encodedLine += position;
            } else if (position == ' ') {
                encodedLine += '+';
            } else {
                String hexValue = Integer.toHexString(position);
                encodedLine += '%' + hexValue;
            }
        }
    return  encodedLine;
    }
}



