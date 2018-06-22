using Android.App;
using Android.Widget;
using Android.OS;
using Microcharts.Droid;
using Microcharts;

namespace ChartsComponent.Droid
{
    [Activity(Label = "ChartsComponent", MainLauncher = true, Icon = "@mipmap/icon")]
    public class MainActivity : Activity
    {
        int count = 1;

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.Main);

            // Get our button from the layout resource,
            // and attach an event to it

                        var charts = Dataa.CreateQuickstart();

            FindViewById<ChartView>(Resource.Id.chartView1).Chart = charts[0];
            FindViewById<ChartView>(Resource.Id.chartView2).Chart = charts[1];
            FindViewById<ChartView>(Resource.Id.chartView3).Chart = charts[2];
            FindViewById<ChartView>(Resource.Id.chartView4).Chart = charts[3];
            FindViewById<ChartView>(Resource.Id.chartView5).Chart = charts[4];
            FindViewById<ChartView>(Resource.Id.chartView6).Chart = charts[5];

        }
    }
}

