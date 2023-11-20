    import java.util.Scanner ;

    public class uçakBileti {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double KM = 2 ;
// ARKADAŞLAR ORANLARI BÖYLE DEĞİŞKEN OLARAKTA YAPABİLİRSİNİZ , DİREK ORAN OLARAKTA YAZABİLİRSİNİZ .
        // ÖRN :TOPLAMTUTAR*0,30 || TOPLAMTUTAR*ORAN3 GİBİ
        double oran1 =0.50, oran2=0.10 ,oran3=0.30,oran4=0.20, gidişdönüş=0.20;

        int mesafe ,yaş , seçim  ;



        System.out.print("Gidilen mesafeyi giriniz : ");
        mesafe=scan.nextInt() ;

        System.out.print("yaşınızı giriniz : ");
        yaş=scan.nextInt();


        System.out.print("yolculuk tipini giriniz  1- TEK GİDİŞ  2-GİDİŞ DÖNÜŞ : ");
        seçim=scan.nextInt();

        if (yaş<0||mesafe<0||seçim<0||seçim>2)  {
            System.out.println("hatalı veri girdiniz !"); }

       if (yaş < 12);
         {double toplamtutar =mesafe*KM;
                {double yaşindirimi =toplamtutar*oran1 ;
                    {double indirimlitutar =toplamtutar-yaşindirimi ;}

                    }if ((yaş>=12) && (yaş<=24)) ;
                     {   double toplamtutar2 =(double)mesafe*KM ;
                         {double yaşindirimi2 = toplamtutar2 * oran2;
                             {double indirimlitutar = toplamtutar2 - yaşindirimi2;
                             }

                       if ((yaş>24) && (yaş<=65)) ;
                         {double toplamtutar3 =mesafe*KM;
                           {double yaşindirimi3 =toplamtutar3*oran3;
                               {double indirimlitutar=toplamtutar3-yaşindirimi3;

                     }if ((yaş>65)) ;
                         {double toplamtutar4 =mesafe*KM;
                             {double yaşindirimi4 =toplamtutar4*oran4;
                                 {double indirimlitutar =toplamtutar4-yaşindirimi4 ;

                      { if (seçim==1) {
                             System.out.print("bilet fiyatınız  : "+indirimlitutar + " TL "); }
                               { if (seçim==2) {
                                    double gidişdönüşindirim = indirimlitutar * gidişdönüş;
                                        {double sontoplam = (indirimlitutar - gidişdönüşindirim) * 2;
                                              System.out.println("Gidiş Dönüş Uçak Bileti Fiyatınız :" + sontoplam + " TL ");}





                              }}}}}}}}}}}}}





















