package com.example.elysiancorporation.fragment;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.*;

import com.example.elysiancorporation.fragment.AndroidITFragment;
import com.example.elysiancorporation.fragment.AutoCadITFragment;
import com.example.elysiancorporation.fragment.CPlusPlusFragment;
import com.example.elysiancorporation.fragment.CakePhpITFragment;
import com.example.elysiancorporation.fragment.CatiaFragment;
import com.example.elysiancorporation.fragment.CodeIgniterITFragment;
import com.example.elysiancorporation.fragment.DigitalMarketingITFragment;
import com.example.elysiancorporation.fragment.DotNetFragment;
import com.example.elysiancorporation.fragment.EmbeddedSystemITFragment;
import com.example.elysiancorporation.fragment.FinanceITFragment;
import com.example.elysiancorporation.fragment.HybridITFragment;
import com.example.elysiancorporation.fragment.IOSITFragment;
import com.example.elysiancorporation.fragment.IOTFragment;
import com.example.elysiancorporation.fragment.InformationTechnologyFragment;
import com.example.elysiancorporation.fragment.JavaITFragment;
import com.example.elysiancorporation.fragment.LaravelITFragment;
import com.example.elysiancorporation.fragment.MarketingFragment;
import com.example.elysiancorporation.fragment.MatlabFragment;
import com.example.elysiancorporation.fragment.MysqlITFragement;
import com.example.elysiancorporation.fragment.PLCScadaITFragment;
import com.example.elysiancorporation.fragment.PythonITFragment;
import com.example.elysiancorporation.fragment.SoftwareITFragment;
import com.example.elysiancorporation.fragment.SolidWorksITFragment;
import com.example.elysiancorporation.fragment.TallyITFragment;
import com.example.elysiancorporation.fragment.WebDesigningITFragment;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.elysiancorporation.R;
import com.example.elysiancorporation.activity.MainActivity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class TrainingFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    ProgressDialog progressDialog;
    Spinner spinner;
    EditText fullname,email,contact,dob,address,college,collegeaddress;
    CheckBox checkBox;
    RadioButton rb1,rb2,rb3;
    RadioGroup radiogroup;
    Button submit;
    ImageButton image,ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8,ib9,ib10,ib11,ib12,ib13,ib14,ib15,ib16,ib17,ib18,ib19,ib20,ib21,ib22,ib23,ib24,ib25,ib26,ib27,ib28,ib29,ib30,ib31,ib32,ib33,ib34,ib35;
    private int myear,mmonth,mday;
    String RegisterURL = "http://elysiancorporation.com/elysian_app/register.php" ;
    Boolean CheckEditText ;
    String Response;
    String NameHolder, EmailHolder, ContactHolder,DOBHolder,AddressHolder,CollegeHolder,CollegeaddressHolder,CheckboxHolder,SpinnerHolder ;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view1=inflater.inflate(R.layout.fragment_training,container,false);
        spinner=view1.findViewById(R.id.spinner);
        image=view1.findViewById(R.id.image);
        fullname=(EditText)view1.findViewById(R.id.fullname);
        email=(EditText)view1.findViewById(R.id.email);
        contact=(EditText)view1.findViewById(R.id.contact);
        dob=(EditText)view1.findViewById(R.id.dob);
        address=(EditText)view1.findViewById(R.id.address);
        college=(EditText)view1.findViewById(R.id.college);
        collegeaddress=(EditText)view1.findViewById(R.id.collegeaddress);
        rb1=(RadioButton)view1.findViewById(R.id.rb1);
        rb2=(RadioButton)view1.findViewById(R.id.rb2);
        rb3=(RadioButton)view1.findViewById(R.id.rb3);
        checkBox=(CheckBox)view1.findViewById(R.id.checkbox);
        submit=(Button)view1.findViewById(R.id.submit);
        radiogroup=(RadioGroup)view1.findViewById(R.id.radiogroup);

        ib1=view1.findViewById(R.id.ib1);
        ib2=view1.findViewById(R.id.ib2);
        ib3=view1.findViewById(R.id.ib3);
        ib4=view1.findViewById(R.id.ib4);
        ib5=view1.findViewById(R.id.ib5);
        ib6=view1.findViewById(R.id.ib6);
        ib7=view1.findViewById(R.id.ib7);
        ib8=view1.findViewById(R.id.ib8);
        ib9=view1.findViewById(R.id.ib9);
        ib10=view1.findViewById(R.id.ib10);
        ib11=view1.findViewById(R.id.ib11);
        ib12=view1.findViewById(R.id.ib12);
        ib13=view1.findViewById(R.id.ib13);
        ib14=view1.findViewById(R.id.ib14);
        ib15=view1.findViewById(R.id.ib15);
        ib16=view1.findViewById(R.id.ib16);
        ib17=view1.findViewById(R.id.ib17);
        ib18=view1.findViewById(R.id.ib18);
        ib19=view1.findViewById(R.id.ib19);
        ib20=view1.findViewById(R.id.ib20);
        ib21=view1.findViewById(R.id.ib21);
        ib22=view1.findViewById(R.id.ib22);
        ib23=view1.findViewById(R.id.ib23);
        ib24=view1.findViewById(R.id.ib24);
        ib25=view1.findViewById(R.id.ib25);
        ib26=view1.findViewById(R.id.ib26);
        ib27=view1.findViewById(R.id.ib27);
        ib28=view1.findViewById(R.id.ib28);
        ib29=view1.findViewById(R.id.ib29);
        ib30=view1.findViewById(R.id.ib30);
        ib31=view1.findViewById(R.id.ib31);
        ib32=view1.findViewById(R.id.ib32);
        ib33=view1.findViewById(R.id.ib33);
        ib34=view1.findViewById(R.id.ib34);
        ib35=view1.findViewById(R.id.ib35);
        final EditText dob=view1.findViewById(R.id.dob);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar c = Calendar.getInstance();
                myear = c.get(Calendar.YEAR);
                mmonth = c.get(Calendar.MONTH);
                mday = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dp=new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                        dob.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },myear,mmonth,mday);
                dp.show();
            }
        });
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new EthicalHackingFragment());
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new LinuxFragment());
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new NetworkingFragment());
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new CCNAFragment());
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new MCSAFragment());
            }
        });
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new PHPFragment());
            }
        });
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new WordpressFragment());
            }
        });
        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new CodeIgniterITFragment());
            }
        });
        ib9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new CakePhpITFragment());
            }
        });
        ib10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new LaravelITFragment());
            }
        });
        ib11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new WebDesigningITFragment());
            }
        });
        ib12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new MysqlITFragement());
            }
        });
        ib13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new JavaITFragment());
            }
        });
        ib14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new AndroidITFragment());
            }
        });
        ib15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new IOSITFragment());
            }
        });
        ib16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new HybridITFragment());
            }
        });
        ib17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new PythonITFragment());
            }
        });
        ib18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new MatlabFragment());
            }
        });
        ib19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new EmbeddedSystemITFragment());
            }
        });
        ib20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new IOTFragment());
            }
        });
        ib21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new CPlusPlusFragment());
            }
        });
        ib22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new DotNetFragment());
            }
        });
        ib23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new SoftwareITFragment());
            }
        });
        ib24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new DigitalMarketingITFragment());
            }
        });
        ib25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new SeoItFragment());
            }
        });
        ib26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new CCNAFragment());
            }
        });
        ib27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new FinanceITFragment());
            }
        });
        ib28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new InformationTechnologyFragment());
            }
        });
        ib29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new MarketingFragment());
            }
        });
        ib30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new TallyITFragment());
            }
        });
        ib31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new PLCScadaITFragment());
            }
        });
        ib32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new AutoCadITFragment());
            }
        });
        ib33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new SolidWorksITFragment());
            }
        });
        ib34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new CloudComputingITFragment());

            }
        });
        ib35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new CatiaFragment());
            }
        });


        spinner.setOnItemSelectedListener(this);
        ArrayList<String> al=new ArrayList<String>();
        al.add("C/C++");
        al.add("Java");
        al.add("Android");
        al.add("IOS");
        al.add("PHP");
        al.add("Web Designing");
        al.add("Database");
        al.add("Oracle");
        al.add("MySQL");
        al.add("Dot Net");
        al.add("Software Testing");
        al.add("Digital Marketing");
        al.add("Cloud Computing");
        al.add("SEO/SMO");
        al.add("Solid Works");
        al.add("AutoCAD");
        al.add("Catia");
        al.add("Staad Pro");
        al.add("Rewitz");
        al.add("Networking");
        al.add("CCNA/CCNP");
        al.add("MCSA/MCSE");
        al.add("MatLAb");
        al.add("IOT");
        al.add("Embedded Systems");
        al.add("PLC SCADA");

        ArrayAdapter<String> dataAdapter=new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,al);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetCheckEditTextIsEmptyOrNot();
                if(CheckEditText){
                    registerUser(NameHolder,EmailHolder,ContactHolder,DOBHolder,AddressHolder,CollegeHolder,CollegeaddressHolder);
                }
                else {
                    Toast.makeText(getActivity(), "Please fill all form fields.", Toast.LENGTH_LONG).show();
                }
            }
        });





        return view1;
    }

    public void GetCheckEditTextIsEmptyOrNot(){
        NameHolder = fullname.getText().toString();
        EmailHolder = email.getText().toString();
        ContactHolder = contact.getText().toString();
        DOBHolder = dob.getText().toString();
        AddressHolder = address.getText().toString();
        CollegeHolder = college.getText().toString();
        CollegeaddressHolder = collegeaddress.getText().toString();
/*        CheckboxHolder = checkBox.getText().toString();
        SpinnerHolder = spinner.getTransitionName();*/
        if(TextUtils.isEmpty(NameHolder) || TextUtils.isEmpty(EmailHolder) || TextUtils.isEmpty(ContactHolder)|| TextUtils.isEmpty(DOBHolder)|| TextUtils.isEmpty(AddressHolder)|| TextUtils.isEmpty(CollegeHolder)|| TextUtils.isEmpty(CollegeaddressHolder))
        {
            CheckEditText = false;
        }
        else {

            CheckEditText = true ;
        }
    }

    public void registerUser(final String name,final String email, final String contact,final String dob,final String address,final String college,final String collegeaddress)
    {
        progressDialog = ProgressDialog.show(getActivity(), "Loading Data", null, true, true);
        RequestQueue rq = Volley.newRequestQueue(getActivity());
        StringRequest st = new StringRequest(Request.Method.POST, RegisterURL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getActivity(),"" + response, Toast.LENGTH_LONG).show();
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
                params.put("name", name);
                params.put("email", email);
                params.put("contact", contact);
                params.put("dob", dob);
                params.put("address", address);
                params.put("college", college);
                params.put("collegeaddress", collegeaddress);
                /*params.put("spinner", spinner);
                params.put("checkbox", checkbox);*/

                return params;
            }
        };
        rq.add(st);
    }
        public void getFragment(Fragment fragment) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


   }
