package com.example.skthealthypet;
import androidx.fragment.app.Fragment;

public class ShopValues extends Fragment {
    public int money = 0;
    public int[] hats = {0,0,0,0,0,0};
    public int[] beds = {0,0,0,0,0,0};
    public int[] closets = {0,0,0,0,0,0};
    public int[] walls = {0,0,0,0,0,0};
    public int[] floors = {0,0,0,0,0,0};

    final int [] hats_price = {15000,15000,25000,0,0,0};
    final int [] beds_price = {20000,20000,20000,30000,30000,60000};
    final int [] closets_price = {30000,40000,40000,0,0,0};
    final int [] walls_price = {30000,30000,30000,30000,0,0};
    final int [] floors_price = {25000,25000,25000,25000,0,0};

    public String [] hats_name = {"별모양 핀","하트모양 핀","사각 선글라스","","",""};
    public String [] beds_name = {"파란침대","주황침대","초록침대","파란텐트","주황텐트","햄버거"};
    public String [] closets_name = {"평범한 옷장","세련된 옷장","심플한 옷장","","",""};
    public String [] walls_name = {"주황벽지","파란벽지","빨간벽지","초록벽지","",""};
    public String [] floors_name = {"주황바닥","빨간바닥","파란바닥","초록바닥","",""};

    public String [] hats_content = {"\"반짝반짝\"","뿅뿅","시크해보인다","","",""};
    public String [] beds_content = {"시원해보이는 침대","따뜻해보이는 침대","편안해보이는 침대","시원해보이는 텐트","따뜻해보이는 텐트","배고파진다..."};
    public String [] closets_content = {"평범하다","나도 옷 전문가?","나도 정리 전문가?","","",""};
    public String [] walls_content = {"따뜻해보이는 벽지","시원해보이는 벽지","안정돼보이는 벽지","편안해보이는 벽지","",""};
    public String [] floors_content = {"따뜻해보이는 바닥","안정돼보이는 바닥","시원해보이는 바닥","편안해보이는 바닥","",""};

}

