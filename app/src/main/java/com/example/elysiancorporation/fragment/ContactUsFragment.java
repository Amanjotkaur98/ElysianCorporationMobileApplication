package com.example.elysiancorporation.fragment;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.elysiancorporation.R;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;
import java.util.Map;

public class ContactUsFragment extends Fragment implements OnMapReadyCallback{
    ProgressDialog progressDialog;
    SupportMapFragment mapFragment;
    private GoogleMap mMap;
    EditText fname,lname,email,contact,subject,message;
    Button submit;
    String GetinTouchURL = "http://elysiancorporation.com/elysian_app/getintouch.php" ;
    Boolean CheckEditText ;
    String Response;
    String FNameHolder,LNameHolder, EmailHolder, ContactHolder,SubjectHolder,MessageHolder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_contactus, container, false);
        mapFragment= (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        fname=(EditText)v.findViewById(R.id.fname);
        lname=(EditText)v.findViewById(R.id.lname);
        email=(EditText)v.findViewById(R.id.email);
        contact=(EditText)v.findViewById(R.id.contact);
        subject=(EditText)v.findViewById(R.id.subject);
        message=(EditText)v.findViewById(R.id.message);
        submit=(Button)v.findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetCheckEditTextIsEmptyOrNot();
                if(CheckEditText){
                    getinTouchUser(FNameHolder,LNameHolder,EmailHolder,ContactHolder,SubjectHolder,MessageHolder);
                }
                else {
                    Toast.makeText(getActivity(), "Please fill all form fields.", Toast.LENGTH_LONG).show();
                }
            }
        });
        return v;
    }
    public void GetCheckEditTextIsEmptyOrNot(){
        FNameHolder = fname.getText().toString();
        LNameHolder = lname.getText().toString();
        EmailHolder = email.getText().toString();
        ContactHolder = contact.getText().toString();
        SubjectHolder=subject.getText().toString();
        MessageHolder=message.getText().toString();
        if(TextUtils.isEmpty(FNameHolder)|| TextUtils.isEmpty(LNameHolder) || TextUtils.isEmpty(EmailHolder) || TextUtils.isEmpty(ContactHolder)|| TextUtils.isEmpty(SubjectHolder)|| TextUtils.isEmpty(MessageHolder))
        {
            CheckEditText = false;
        }
        else {

            CheckEditText = true ;
        }
    }
    public void getinTouchUser(final String fname,final String lname,final String email, final String contact,final String subject,final String message){
        progressDialog = ProgressDialog.show(getActivity(),"Loading Data",null,true,true);
        RequestQueue rq= Volley.newRequestQueue(getActivity());
        StringRequest st=new StringRequest(Request.Method.POST, GetinTouchURL, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getActivity(), ""+response, Toast.LENGTH_LONG).show();
                progressDialog.dismiss();
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.dismiss();
                Toast.makeText(getActivity(), ""+error, Toast.LENGTH_LONG).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("name", fname);
                params.put("name", lname);
                params.put("email", email);
                params.put("contact", contact);
                params.put("dob", subject);
                params.put("address", message);
                return params;
            }
        };
        rq.add(st);

    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(30.712954, 76.709390);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Elysian Corporation"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        CameraPosition cameraPosition = new CameraPosition.Builder().target(sydney).zoom(15.0f).build();
        CameraUpdate cameraUpdate = CameraUpdateFactory.newCameraPosition(cameraPosition);
        mMap.moveCamera(cameraUpdate);
        mMap.getUiSettings().setZoomControlsEnabled(true);

        //for Location  Button enable on Google Map
        mMap.getUiSettings().setMyLocationButtonEnabled(true);


    }
}
