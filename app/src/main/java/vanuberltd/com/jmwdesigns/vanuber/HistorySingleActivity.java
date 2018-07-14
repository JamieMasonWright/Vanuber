package vanuberltd.com.jmwdesigns.vanuber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.directions.route.Route;
import com.directions.route.RouteException;
import com.directions.route.RoutingListener;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import java.util.ArrayList;

public class HistorySingleActivity extends AppCompatActivity implements OnMapReadyCallback, RoutingListener  {

    private GoogleMap mMap;
    private SupportMapFragment mMapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_single);

        mMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);

        mMapFragment.getMapAsync(this);
    }

    @Override
    public void onRoutingFailure(RouteException e) {

    }

    @Override
    public void onRoutingStart() {

    }

    @Override
    public void onRoutingSuccess(ArrayList<Route> arrayList, int i) {

    }

    @Override
    public void onRoutingCancelled() {

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}
