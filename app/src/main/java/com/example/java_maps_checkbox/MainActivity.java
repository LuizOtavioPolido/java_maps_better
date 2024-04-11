package com.example.java_maps_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PhotoView photo_state = findViewById(R.id.state_map_image);
        RadioGroup optionsCity = findViewById(R.id.options_city);
        optionsCity.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radio_parana) {
                    cleanRadioBtn();
                        updateStateInfo("Capital: Curitiba", "População: 11.516.840", "IDH: 0.749", "Número de municipios: 399", "Densidade: 53.2", "Area: 199.315 km²");
                } else if (checkedId == R.id.radio_santa) {
                    cleanRadioBtn();
                        updateStateInfo("Capital: Florianópolis", "População: 7.252.502", "IDH: 0.774", "Número de municipios: 295", "Densidade: 68.4", "Area: 95.346 km²");
                } else if (checkedId == R.id.radio_rio) {
                    cleanRadioBtn();
                        updateStateInfo("Capital: Porto Alegre", "População: 11.422.973", "IDH: 0.746", "Número de municipios: 497", "Densidade: 40.2", "Area: 281.730 km²");
                }


            }
        });
    }

    private void cleanRadioBtn(){
        RadioButton radio_location = findViewById(R.id.radio_locale);
        RadioButton radio_population = findViewById(R.id.radio_population);
        RadioButton radio_idh = findViewById(R.id.radio_idh);
        RadioButton radio_num_munic = findViewById(R.id.radio_num_munic);
        RadioButton radio_area = findViewById(R.id.radio_area);

        radio_population.setActivated(false);
        radio_location.setActivated(false);
        radio_idh.setActivated(false);
        radio_num_munic.setActivated(false);
        radio_area.setActivated(false);


    };

    private void updateStateInfo(String capital, String population, String idh, String numMunicipios, String densidadeDemografica, String area) {
        TextView capitalTextView = findViewById(R.id.locale);
        TextView populationTextView = findViewById(R.id.population);
        TextView idhTextView = findViewById(R.id.idh);
        TextView numMunicipiosTextView = findViewById(R.id.n_cities);
        TextView areaTextView = findViewById(R.id.area);

        RadioButton radio_location = findViewById(R.id.radio_locale);
        RadioButton radio_population = findViewById(R.id.radio_population);
        RadioButton radio_idh = findViewById(R.id.radio_idh);
        RadioButton radio_num_munic = findViewById(R.id.radio_num_munic);
        RadioButton radio_area = findViewById(R.id.radio_area);

        if(radio_location.isActivated()){
            capitalTextView.setText(capital);
        }
        if(radio_population.isActivated()){
            populationTextView.setText(population);
        }
        if(radio_idh.isActivated()){
            idhTextView.setText(idh);
        }
        if(radio_num_munic.isActivated()){
            numMunicipiosTextView.setText(numMunicipios);
        }
        if(radio_area.isActivated()){
            areaTextView.setText(area);
        }








    }

//    public void setStateInfos(TextInputEditText inputClient) {
//        String inputText = inputClient.getText().toString();
//        Estado parana = new Estado("Cidade: Paraná", "Capita: Curitiba", "População: 11.516.840", "IDH: 0.749", "Numero de municipios: 399", "Densidade: 53.2", "Area: 199.315 km²");
//        Estado santaCatarina = new Estado("Cidade: Santa Catarina", "Capita: Florianópolis", "População: 7.252.502", "IDH: 0.774", "Numero de municipios: 295", "Densidade: 68.4", "Area: 95.346 km²");
//
//        Estado rioGrandeDoSul = new Estado("Cidade: Rio Grande do Sul", "Capita: Porto Alegre", "População: 11.422.973", "IDH: 0.746", "Numero de municipios: 497", "Densidade: 40.2", "Area: 281.730 km²");
//
//        TextView capital = findViewById(R.id.locale);
//        TextView idh = findViewById(R.id.idh);
//        TextView populacao = findViewById(R.id.population);
//        TextView area = findViewById(R.id.area);
//        TextView municipios = findViewById(R.id.n_cities);
//        PhotoView image = findViewById(R.id.state_map_image);
//
//        if (inputText.equals("PR")) {
//            capital.setText(parana.capital);
//            idh.setText(parana.idh);
//            area.setText(parana.area);
//            populacao.setText(parana.populacao);
//            municipios.setText(parana.numMunicipios);
//        } else if (inputText.equals("SC")) {
//            capital.setText(santaCatarina.capital);
//            idh.setText(santaCatarina.idh);
//            area.setText(santaCatarina.area);
//            populacao.setText(santaCatarina.populacao);
//            municipios.setText(santaCatarina.numMunicipios);
//        } else if (inputText.equals("RS")) {
//            capital.setText(rioGrandeDoSul.capital);
//            idh.setText(rioGrandeDoSul.idh);
//            area.setText(rioGrandeDoSul.area);
//            populacao.setText(rioGrandeDoSul.populacao);
//            municipios.setText(rioGrandeDoSul.numMunicipios);
//        }
//    }
}