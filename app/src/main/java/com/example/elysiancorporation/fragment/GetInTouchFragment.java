package com.example.elysiancorporation.fragment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
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
import android.widget.ImageButton;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.elysiancorporation.R;

import java.util.HashMap;
import java.util.Map;

public class GetInTouchFragment extends Fragment {
    ProgressDialog progressDialog;
    ImageButton fblink, instalink, googlelink, linkedinlink;
    EditText fname, lname, email, contact, subject, message;
    Button submit;
    String GetinTouchURL = "http://elysiancorporation.com/elysian_app/getintouch.php";
    Boolean CheckEditText;
    String Response;
    String FNameHolder, LNameHolder, EmailHolder, ContactHolder, SubjectHolder, MessageHolder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement_getintouch, container, false);
        fblink = (ImageButton) view.findViewById(R.id.fblink);
        fname = (EditText) view.findViewById(R.id.fname);
        lname = (EditText) view.findViewById(R.id.lname);
        email = (EditText) view.findViewById(R.id.email);
        contact = (EditText) view.findViewById(R.id.contact);
        subject = (EditText) view.findViewById(R.id.subject);
        message = (EditText) view.findViewById(R.id.message);
        submit = (Button) view.findViewById(R.id.submit);
        instalink = (ImageButton) view.findViewById(R.id.instalink);
        googlelink = (ImageButton) view.findViewById(R.id.goolgelink);
        linkedinlink = (ImageButton) view.findViewById(R.id.linkedinlink);

        fblink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://m.facebook.com/Elysian-Corporation-224862361404509/"));
                startActivity(intent);
            }
        });
        instalink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://https://www.instagram.com/elysiancorporation/"));
                startActivity(intent);
            }
        });
        googlelink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://plus.google.com/101037818780977880211"));
                startActivity(intent);
            }
        });
        linkedinlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.linkedin.com/company/elysian-corporation"));
                startActivity(intent);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetCheckEditTextIsEmptyOrNot();
                if (CheckEditText) {
                    getinTouchUser(FNameHolder, LNameHolder, EmailHolder, ContactHolder, SubjectHolder, MessageHolder);
                } else {
                    Toast.makeText(getActivity(), "Please fill all form fields.", Toast.LENGTH_LONG).show();
                }
            }
        });
        return view;
    }

    public void GetCheckEditTextIsEmptyOrNot() {
        FNameHolder = fname.getText().toString();
        LNameHolder = lname.getText().toString();
        EmailHolder = email.getText().toString();
        ContactHolder = contact.getText().toString();
        SubjectHolder = subject.getText().toString();
        MessageHolder = message.getText().toString();
        if (TextUtils.isEmpty(FNameHolder) || TextUtils.isEmpty(LNameHolder) || TextUtils.isEmpty(EmailHolder) || TextUtils.isEmpty(ContactHolder) || TextUtils.isEmpty(SubjectHolder) || TextUtils.isEmpty(MessageHolder)) {
            CheckEditText = false;
        } else {

            CheckEditText = true;
        }
    }

    public void getinTouchUser(final String fname, final String lname, final String email, final String contact, final String subject, final String message) {
        progressDialog = ProgressDialog.show(getActivity(), "Loading Data", null, true, true);
        RequestQueue rq = Volley.newRequestQueue(getActivity());
        StringRequest st = new StringRequest(Request.Method.POST, GetinTouchURL, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getActivity(), "" + response, Toast.LENGTH_LONG).show();
                progressDialog.dismiss();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.dismiss();
                Toast.makeText(getActivity(), "" + error, Toast.LENGTH_LONG).show();
            }
        }) {
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
}
