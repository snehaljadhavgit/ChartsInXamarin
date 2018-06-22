package md596b1d29283cec6b831dbcf8744185965;


public class ChartView
	extends md5f24c356e1394bd37d0c871b61b28ee61.SKCanvasView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Microcharts.Droid.ChartView, ChartsComponent.Droid", ChartView.class, __md_methods);
	}


	public ChartView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ChartView.class)
			mono.android.TypeManager.Activate ("Microcharts.Droid.ChartView, ChartsComponent.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public ChartView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ChartView.class)
			mono.android.TypeManager.Activate ("Microcharts.Droid.ChartView, ChartsComponent.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public ChartView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == ChartView.class)
			mono.android.TypeManager.Activate ("Microcharts.Droid.ChartView, ChartsComponent.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public ChartView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == ChartView.class)
			mono.android.TypeManager.Activate ("Microcharts.Droid.ChartView, ChartsComponent.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
