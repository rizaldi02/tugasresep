package com.example.user.resepmasakan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Resepku> resepList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ResepAdapter mAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv_main);

        mAdapter = new ResepAdapter(this,resepList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        preparResepData();

    }

    public void preparResepData(){
        Resepku resepku;
        for (int i=0 ; i<3 ;i++){
            resepku = new Resepku("Ayam Kecap", R.drawable.ayamkecap,"Ayam Kecap Nomor 1"
                    ," Bahan\n" +
                    "\n" +
                    "    1/2 ekor ayam, potong 6 bagian, tambahkan 1/2 sendok teh garam dan 2 sendok makan air jeruk nipis, aduk rata\n" +
                    "    4 siung bawang putih, memarkan\n" +
                    "    1/2 ruas jari jahe, memarkan\n" +
                    "    1/2 butir bawang bombai, potong panjang\n" +
                    "    2 tangkai daun bawang, potong serong\n" +
                    "    5 sendok makan Kecap Bango Manis Pedas Gurih\n" +
                    "    1/2 sendok teh lada putih bubuk\n" +
                    "    1/4 sendok teh garam\n" +
                    "    1 buah tomat, potong panjang\n" +
                    "    100 ml air\n" +
                    "    Minyak goreng secukupknya untuk menggoreng\n" +
                    "    1 sendok makan margarin, untuk menumis\n" +
                    "\n" +
                    "Cara memasak\n" +
                    "\n" +
                    "    Panaskan minyak, goreng ayam dalam minyak panas hingga matang tapi tidak kering, angkat, sisihkan.\n" +
                    "    Panaskan margarin, tumis jahe dan bawang putih hingga harum, lalu masukkan bawang bombai, tumis hingga layu.\n" +
                    "    Masukkan ayam, aduk sebentar.\n" +
                    "    Tambahkan Kecap Bango Manis Pedas Gurih, air, garam, lada, tumis hingga matang. Masukkan tomat dan daun bawang, aduk sebentar, angkat.\n" +
                    "    Sajikan hangat.\n" +
                    "\n");
            resepList.add(resepku);

            resepku = new Resepku("Seblak Ceker", R.drawable.seblak,"Seblak Pedas",
                    " Bahan\n" +
                            "\n" +
                            "300 gram ceker\n" +
                            "1.000 ml air \n" +
                            "2 butir telur, kocok lepas \n" +
                            "200 gram kerupuk merah, rendam\n" +
                            "2 batang caisim, potong 2 cm\n" +
                            "50 gram taoge\n" +
                            "1 1/2 sendok makan KECAP MANIS BANGO\n" +
                            "3 1/4 sendok teh garam\n" +
                            "1/4 sendok teh kaldu ayam bubuk \n" +
                            "1/4 sendok teh merica bubuk \n" +
                            "2 sendok teh gula pasir \n" +
                            "2 sendok makan minyak untuk menumis \n" +
                            "\n" +
                            "Bumbu halus:\n" +
                            "\n" +
                            "2 siung bawang putih\n" +
                            "3 buah bawang merah \n" +
                            "3 cm kencur \n" +
                            "1 buah cabai merah besar\n" +
                            "4 buah cabai rawit merah\n" +
                            "\n" +
                            " \n" +
                            "Cara Memasak\n" +
                            "\n" +
                            "    Rebus ceker bersama air sampai matang dan empuk. Ukur kaldunya 400 ml. Sisihkan \n" +
                            "    Tumis bumbu halus sampai harum. Sisihkan bumbu di sisi wajan. Masukkan telur. Aduk sampai berbutir. Tambahkan ceker dan kerupuk. Aduk rata.\n" +
                            "    Masukkan caisim dan taoge. Aduk sampai layu. Tuangkan air rebusan ceker. Aduk rata. Masukkan KECAP MANIS BANGO. Aduk rata.\n" +
                            "    Bubuhi garam, kaldu ayam bubuk, merica bubuk dan gula pasir. Aduk rata. Masak sampai matang.\n" +
                            "\n" +
                            "Tips: \n" +
                            "\n" +
                            "Untuk membuat seblak bumbu utamanya adalah kencur. Jika ingin lebih terasa kencur bisa ditambahkan di dalam bumbu halus.");
            resepList.add(resepku);

            resepku = new Resepku("Sweke", R.drawable.sweke,"Sweke Kodok",
                    "\n" +
                            "Bahan-bahan\n" +
                            "\n" +
                            "    400 gram swike\n" +
                            "    3 buah jahe\n" +
                            "    15 siung bawang putih\n" +
                            "    3 sdm tauco yg sudah diulek halus\n" +
                            "    1 sdm kecap manis\n" +
                            "    secukupnya garam,merica,gula,micin\n" +
                            "\n" +
                            "Langkah\n" +
                            "\n" +
                            "    Ulek halus 5 bawang putih dan 1jahe, beri air 500ml tambahkan 1sdm garam dan 1sdt micin, masukan swike rendam selama 30menit\n" +
                            "\n" +
                            "    Iris sisa bawang putih dan jahe, tumis hingga kecoklatan, tambahkan tauco yg sudah dihaluskan masak. Masukan swike yg sudah ditiriskan. Lalu tambahkan kecap manis. Masak hingga swike kaku. Tambahkan air secukupnya untuk kuah. Masukan garam,merica,micin,gula sesuai selera\n" +
                            "\n" +
                            "    Taburi dengan irisan seledri dan bawang goreng\n");
            resepList.add(resepku);
        }

        mAdapter.notifyDataSetChanged();

    }
}
