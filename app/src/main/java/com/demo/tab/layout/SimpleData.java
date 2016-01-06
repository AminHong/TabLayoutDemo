package com.demo.tab.layout;

import com.demo.tab.layout.object.ItemObj;
import com.demo.tab.layout.object.ItemsLayoutObj;

import java.util.ArrayList;

public class SimpleData {

    public static ArrayList<ItemsLayoutObj> getItemLayoutArrayList_1(){
        ArrayList<ItemsLayoutObj> arrayList = new ArrayList<>();

        ItemsLayoutObj itemsLayoutObj = new ItemsLayoutObj();
        itemsLayoutObj.setId(1);
        itemsLayoutObj.setTitle("本週Play精選");
        itemsLayoutObj.setDescription("我們推薦的遊戲");
        arrayList.add(itemsLayoutObj);

        itemsLayoutObj = new ItemsLayoutObj();
        itemsLayoutObj.setId(2);
        itemsLayoutObj.setTitle("為您推薦");
        itemsLayoutObj.setDescription("");
        arrayList.add(itemsLayoutObj);

        itemsLayoutObj = new ItemsLayoutObj();
        itemsLayoutObj.setId(3);
        itemsLayoutObj.setTitle("工具");
        itemsLayoutObj.setDescription("為您推薦");
        arrayList.add(itemsLayoutObj);

        itemsLayoutObj = new ItemsLayoutObj();
        itemsLayoutObj.setId(4);
        itemsLayoutObj.setTitle("本週Play精選");
        itemsLayoutObj.setDescription("我們推薦的應用程式");
        arrayList.add(itemsLayoutObj);

        itemsLayoutObj = new ItemsLayoutObj();
        itemsLayoutObj.setId(5);
        itemsLayoutObj.setTitle("交通運輸應用程式");
        itemsLayoutObj.setDescription("為您推薦");
        arrayList.add(itemsLayoutObj);

        itemsLayoutObj = new ItemsLayoutObj();
        itemsLayoutObj.setId(6);
        itemsLayoutObj.setTitle("您可能會喜歡...");
        itemsLayoutObj.setDescription("根據您最近安裝的應用程式");
        arrayList.add(itemsLayoutObj);

        itemsLayoutObj = new ItemsLayoutObj();
        itemsLayoutObj.setId(7);
        itemsLayoutObj.setTitle("媒體與影片應用程式");
        itemsLayoutObj.setDescription("為您推薦");
        arrayList.add(itemsLayoutObj);

        return arrayList;
    }

    public static ArrayList<ItemsLayoutObj> getItemLayoutArrayList_2(){
        ArrayList<ItemsLayoutObj> arrayList = new ArrayList<>();

        ItemsLayoutObj itemsLayoutObj = new ItemsLayoutObj();
        itemsLayoutObj.setId(11);
        itemsLayoutObj.setTitle("最新發行的影片");
        itemsLayoutObj.setDescription("不能錯過的最新大片");
        arrayList.add(itemsLayoutObj);

        itemsLayoutObj = new ItemsLayoutObj();
        itemsLayoutObj.setId(12);
        itemsLayoutObj.setTitle("暢銷電子書排行版");
        itemsLayoutObj.setDescription("電子書潮流怎能不跟上");
        arrayList.add(itemsLayoutObj);

        itemsLayoutObj = new ItemsLayoutObj();
        itemsLayoutObj.setId(13);
        itemsLayoutObj.setTitle("為您推薦");
        itemsLayoutObj.setDescription("");
        arrayList.add(itemsLayoutObj);

        itemsLayoutObj = new ItemsLayoutObj();
        itemsLayoutObj.setId(14);
        itemsLayoutObj.setTitle("最暢銷的電影");
        itemsLayoutObj.setDescription("看看別人看什麼");
        arrayList.add(itemsLayoutObj);

        itemsLayoutObj = new ItemsLayoutObj();
        itemsLayoutObj.setId(15);
        itemsLayoutObj.setTitle("新年開始新習慣");
        itemsLayoutObj.setDescription("閱讀頂尖的新聞來源");
        arrayList.add(itemsLayoutObj);

        return arrayList;
    }

    public static ArrayList<ItemObj> getItemArrayList_1(){
        ArrayList<ItemObj> arrayList = new ArrayList<>();
        ItemObj itemObj = new ItemObj();
        itemObj.setName("喪屍之戰");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/Lx0DCnyXT9Azql7fDqfB_rtYg7t6DfrPPmi4ZN3zRknuuilVwmFGjgu1lcIhjWNo_8s=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("暗影格鬥２");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/QiF_Ii25HqSBrecLkIFOQw8D0bEF4xcHDPJW7RJpOGImyAW1O55VTkfuW4Mi9s1L_E0=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("3D像素射击");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/XFJ37AQseDm-lU6u4XMa8KYp8eAvIVurQsQKMzL1jVOaHdOZaQpdRhnFfY9kY-z2zzc=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("Need for Speed™");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/iJUn7YncJwy2BMKvTp5d9OFZCHkVKN2GemxR-rp3jggPcGE2xEvS26CUAbUrFmfV1rA9=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("羅馬戰神");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/25pcMWRZfy1Fv4wUsAMGytzwZ-i3gS2YKi4gqwrySzFU1S3kyCQtboSXzv3Sy8qveQw=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("奇想之戰");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/kVq-g-NHecoRPtMRz16zgp5t2vuKGr_JyF7G0T8z9EnkvobcBibedBlv4x8BiYgNEzM=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("星光大冒險");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/OmAPBTq0uPM0HtwOmB-Zm52Am69Ov4WHhC2mCM6uI0_qGrplcA1REFuy-m0nM2Yhx0M1=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("無限迷宮");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/KK7mP_etdtFFzdNBa6XTAenfnXEXiGTtqT8Lv4bffra99bT4e_JvK6n5Xp5rvEVQZEA=w300-rw");
        arrayList.add(itemObj);

        return arrayList;
    }

    public static ArrayList<ItemObj> getItemArrayList_2(){
        ArrayList<ItemObj> arrayList = new ArrayList<>();
        ItemObj itemObj = new ItemObj();
        itemObj.setName("永恒战士2");
        itemObj.setImageUrl("https://lh6.ggpht.com/G-wztHDvhYGgCuQ7cDy2n8FqTmVFJGOjVThMpAzNaqDp3tCcGYOZ89obsQsHMqpkROhl=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("Canabalt HD");
        itemObj.setImageUrl("https://lh3.ggpht.com/A81jNq8xjd9vmxgn-07o-QFyO7pdBEz3K2u0Iq0LD223_EOxYn58OQVcayS2HNsX9Q=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("Stars Path");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/d-rZuCANItVUFw4d0B1n8ObQU1jA9LbD8dpg4eQDr9zUcVCdaCJ_IgjgVBCHyvxizQ=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("24（二十四）");
        itemObj.setImageUrl("https://lh4.ggpht.com/t81LzCZUgfvE53nvUUTAAYtzZ4seHJiWC_YXdTCwnSzvCqH9VFo59huMnuPaz2CAzher=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("Colors United");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/0H4OoGemXNt4LEpogvzBqHEg5MP8LSMTyF4NhcBuox19iNaUL3khC5n2ejUFROrQq7wC=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("乌鸦森林之谜 2");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/M3fez2xpkAaSShv5KhZCxgjlrIHCJsafxjXBx93L814kZ-yRKQFj7awC3TnGlSVaeCs=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("CrossWorlds: the Flying City");
        itemObj.setImageUrl("https://lh3.ggpht.com/odJluXGarjs3ad7SrThpRS6QnG-W51jrNRkFZgf-SCFar3LIuP65oDzAz9WEL3NtNQ=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("培養偶像之蛋");
        itemObj.setImageUrl("https://lh3.ggpht.com/O-LBwU0DKDuAu9qH5e_97_WlFkVfP_l85E8-J99B0Z_5HVby6MEnlznDf-rZRXqUtUv3=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("Microtrip");
        itemObj.setImageUrl("https://lh3.ggpht.com/peGWP1b0sthW6Utka5bfbGVQZML_NqiCnBwSofgRj7Xi3qESzEyN1SA9k48qiGJlXkz7=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("土龍大發現");
        itemObj.setImageUrl("https://lh6.ggpht.com/--cxJJfwp9nFGJoMRIJ3wZ4tQnvP3m-urH80mQd0PD0cG8AwknLLJn77pnUuNBHJS5hg=w300-rw");
        arrayList.add(itemObj);

        return arrayList;
    }

    public static ArrayList<ItemObj> getItemArrayList_3(){
        ArrayList<ItemObj> arrayList = new ArrayList<>();
        ItemObj itemObj = new ItemObj();
        itemObj.setName("Material Design UI Template");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/xJkjJ3IVLKs8AY2H-3sO4_29KnGbQmgUlEnu8OViEaTViXiBMrJyOyQLX8VMK1q1HA=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("電池續航力高-釋放記憶體for Andriod");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/vCPXacWUfNiZKULp73L5xFyNMkjt3tg-cIw1EtBTe0ClfT-AvAXFpZ_yzHfcNyXE=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("數據流量測量");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/WZSYeXy-3jmuxVU4ah1d1N-3Ib4AzLk3hz-IIgSAmcFgiA4qmQHw7oVtRZ1ql_nwdg=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("多國語言翻譯");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/6JUSP4LrZJmh13fF3cElft3EyA8XsKaLNbVgahJYUhYLM-pDcxTFa7iOkz045n9GHPYs=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("Developer (Material design)");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/_YmDn7OevCys9Xr1mOmPc-L50PKkPA5Nz2ByQsHWgsPI1ideFpzqOwo5x6TUZ0TFB-g=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("Wake Up Alarm");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/bQ9e2JU3jR5oogO_GDSZdnoo6iXRnf5l_-pXJpFv1W7OxYJfKXvbXkqXe9D2KxFd7bDW=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("快速備忘");
        itemObj.setImageUrl("https://lh3.ggpht.com/Tsc4KMC04qsaw8ALkd_fFzFHyOML361Ij5FQ4YEKKJc_OlwvIeWOuTVqMB4QF75Yc5k=w300-rw");
        arrayList.add(itemObj);

        return arrayList;
    }

    public static ArrayList<ItemObj> getItemArrayList_4(){
        ArrayList<ItemObj> arrayList = new ArrayList<>();
        ItemObj itemObj = new ItemObj();
        itemObj.setName("Skyscanner – 搜尋便宜航班");
        itemObj.setImageUrl("https://lh3.ggpht.com/4lxht_EA0Y5M5wZjqoSK8IRO3wyuPBVFU8Kwjbs-fMgf_klWQEZHi4mxCZMa21upCQ=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("Expedia 智遊網 – 酒店及機票預訂");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/-07eDxfe5u3R0r1dinVj4gSOjOa6ZrMuep8HqWPwQQtpM2MubYaX1WWGCwtfi-Fy6WQ=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("SignEasy:Sign & Fill Documents");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/CDABHKq7GgxJE-ByaBf3Y3YEivdsTY_qqhLazqYyGo4-oqvzuZlXZ2s9ZuUuRFf6lT8=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("Kobo Books - Reading App");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/NtN9QDUeHXz6sGQI3Bff3UGAklXH5cF3NG0huSjCNs3NWLdDOIrblWRAAeyDWAk-UyQ=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("Swarm — by Foursquare");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/bhuhM8EOZdiUCKiy77eyI6pmNGOGTyN7syp62ohrbyb_FADUCxAaJgv_Cy-WMixjbF4=w300-rw");
        arrayList.add(itemObj);

        return arrayList;
    }

    public static ArrayList<ItemObj> getItemArrayList_5(){
        ArrayList<ItemObj> arrayList = new ArrayList<>();
        ItemObj itemObj = new ItemObj();
        itemObj.setName("機車定檢查詢");
        itemObj.setImageUrl("https://lh5.ggpht.com/Vq1xfQExf7Ji0HGmaQ_jXYvjZTRNZTuVZSnG8Wjc8v9slukZpjcvqEwUAWFMu9ErkAY=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("台灣等公車");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/ROLZY7hCjN0IQbjtn9hJ7HpBnSnbRIwa07LMKYNb6tRfMMWyn4ocGCGs0XpC-cFSrvp6=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("監理服務");
        itemObj.setImageUrl("https://lh6.ggpht.com/7dCjNdQuu_Dx6i8HSFGeKNMtSu6N3ZxuJKlMTErTYMJoDxa_yTUNlsroKRNx975BnzD_=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("桃園機場航班時刻表 - 班機即時狀態追蹤查詢");
        itemObj.setImageUrl("https://lh4.ggpht.com/ZOU3EbvgjP2tOlN0zRS_PB7gH4ol2Lsj5pqMW3uqz8Nx28MEmo141fxyxyEfTXu9u8Y=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("韓國地鐵_韓國ing");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/wLN3WLVosKNd0z9Iqxj6H64X_qSjwF4GacuV1J69agozJNbkH3GI34Q8wPFcVOd78g=w300-rw");
        arrayList.add(itemObj);

        return arrayList;
    }

    public static ArrayList<ItemObj> getItemArrayList_7(){
        ArrayList<ItemObj> arrayList = new ArrayList<>();
        ItemObj itemObj = new ItemObj();
        itemObj.setName("爱听4G");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/vDhzhwJ1ULWsO4fdNluoe3YBFKVusOgDcFJkvwYxz_U1DYk3dsYpvc6qdLKulFPBKQ=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("魔力視頻播放機 MoliPlayer");
        itemObj.setImageUrl("https://lh3.ggpht.com/IlS-j1kAg0PY4HjXPZRkh4BWAU4kF-xgnkB_OgsV0xowUB4uqNB9vtRMI9O-qfDu4fCn=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("愛奇藝啪啪奇");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/PxwA6zUxMQqJsYcBzd264OjLCDP8kVGXoxsF34VSJCRea_HiI50kZ3xvapcAjgAYIA=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("萬能視頻播放器");
        itemObj.setImageUrl("https://lh5.ggpht.com/i2JQfEvtMSDhAVZ9aIk9fTGbJ81GzzIEkX_JBNeoFmm9sE0-xAP-keKBlapvOQtV7KYN=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("視頻播放器旗艦版（高清）");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/oRwIYJoZtUf-q5fVooA8ITcA4DgA9FKD-cZUDJ4GR7XUN_1PNPcuX1zXQjlVX-37uQ=w300-rw");
        arrayList.add(itemObj);

        return arrayList;
    }

    public static ArrayList<ItemObj> getItemArrayList(){
        ArrayList<ItemObj> arrayList = new ArrayList<>();
        ItemObj itemObj = new ItemObj();
        itemObj.setName("NANA");
        itemObj.setImageUrl("http://kpopn.com/wp-content/uploads/2015/12/20151227-nana.jpg");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("TZUYU");
        itemObj.setImageUrl("http://static.ettoday.net/images/1510/d1510430.jpg");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("EMMA");
        itemObj.setImageUrl("http://www.people.com.cn/mediafile/pic/20151228/3/3722804968833000695.jpg");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("LIU");
        itemObj.setImageUrl("http://ent.news.cn/2015-12/28/128572762_14512619135451n.jpg");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("NANA");
        itemObj.setImageUrl("http://kpopn.com/wp-content/uploads/2015/12/20151227-nana.jpg");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("TZUYU");
        itemObj.setImageUrl("http://static.ettoday.net/images/1510/d1510430.jpg");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("EMMA");
        itemObj.setImageUrl("http://www.people.com.cn/mediafile/pic/20151228/3/3722804968833000695.jpg");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("LIU");
        itemObj.setImageUrl("http://ent.news.cn/2015-12/28/128572762_14512619135451n.jpg");
        arrayList.add(itemObj);

        return arrayList;
    }

    public static ArrayList<ItemObj> getItemArrayList_11(){
        ArrayList<ItemObj> arrayList = new ArrayList<>();
        ItemObj itemObj = new ItemObj();
        itemObj.setName("Hitman: Agent 47");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/K5d4Jnx-qP0A1NJamgKlbbR903hpUV4b83WKIUigYdAEqIj2yBFjjyhB85ONhUXhBvY=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("刺客聶隱娘");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/wmdP67DtoXxixz9CVyfteV2UrgIUGbmQnA2XxijRn3V_YhvUluOdCECnOlgHmbLM2ycY=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("Steve Jobs: The Man in the Machine");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/otGt1UiUH8c7Z8zcjB2MHpWmOHaIytVwV2_tXcIt6GTgP1wbkMpqzmPOIWxhRgs6zTY=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("Roger Waters The Wall");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/FQZz6h96itYNEXDyapkor_qP59RCg4YwLJ9Ur2lLopRem8cEJwXFjbXPUcr_vucoK6g=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("Hot Tub Time Machine 2");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/5_ZjEZwP11T2aQ8VY6xZgFZW13MbAR5c06LDnLHuRtrNLwfi4CFIPPAq-ZgPIzDDRXE=w300-rw");
        arrayList.add(itemObj);

        return arrayList;
    }

    public static ArrayList<ItemObj> getItemArrayList_12(){
        ArrayList<ItemObj> arrayList = new ArrayList<>();
        ItemObj itemObj = new ItemObj();
        itemObj.setName("青春取向~Be your Lover~(全)");
        itemObj.setImageUrl("https://books.google.com/books/content/images/frontcover/8d9CAgAAQBAJ?fife=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("床上二分之一：禾馬文化紅櫻桃系列675");
        itemObj.setImageUrl("https://books.google.com/books/content/images/frontcover/WeVfBAAAQBAJ?fife=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("霸道少爺(全)：被我蹂躪是妳的榮幸");
        itemObj.setImageUrl("https://books.google.com/books/content/images/frontcover/r2TWBQAAQBAJ?fife=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("咩妹好欺負：禾馬文化紅櫻桃系列647");
        itemObj.setImageUrl("https://books.google.com/books/content/images/frontcover/u8hfBAAAQBAJ?fife=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("糖分先生：甩盡甜餌釣到你");
        itemObj.setImageUrl("https://books.google.com/books/content/images/frontcover/TdMEBAAAQBAJ?fife=w300-rw");
        arrayList.add(itemObj);

        return arrayList;
    }

    public static ArrayList<ItemObj> getItemArrayList_13(){
        ArrayList<ItemObj> arrayList = new ArrayList<>();
        ItemObj itemObj = new ItemObj();
        itemObj.setName("腦筋急轉彎 (電影)");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/t5DZZmfjuI9hzdGFyRZ0pIiKSmlwGpSeLzPr4BlRIob-LmYml5tptzPEKLLCUx5Rqzw=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("偷心少俠(01)");
        itemObj.setImageUrl("https://books.google.com/books/content/images/frontcover/ET_vAgAAQBAJ?fife=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("蟻人 (電影)");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/zkCKb0kAVzVmhvFqRs1WuwLwv83Et6qbWyuT-CK8t8i15apnHwP0_O1YCbXK_V_bvX_O=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("第一次自助遊新加坡超簡單");
        itemObj.setImageUrl("https://books.google.com/books/content/images/frontcover/bSVHAwAAQBAJ?fife=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("紳士密令");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/7gKKqXDQ9BO7aR9Ku5uk1esBYTe65zu7821ywMrFH8H9v32CEWmI1Wygsy_K8hSc65w=w300-rw");
        arrayList.add(itemObj);

        return arrayList;
    }

    public static ArrayList<ItemObj> getItemArrayList_14(){
        ArrayList<ItemObj> arrayList = new ArrayList<>();
        ItemObj itemObj = new ItemObj();
        itemObj.setName("蟻人 (電影)");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/zkCKb0kAVzVmhvFqRs1WuwLwv83Et6qbWyuT-CK8t8i15apnHwP0_O1YCbXK_V_bvX_O=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("Maze Runner: the Scorch Trials");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/DBmTwqy_JyhPHT9UQfoYxIt9TtT83RAglaPL3k6KqMcyIAcnRzh0v0YP00kOSdPS8387Lw=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("紳士密令");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/7gKKqXDQ9BO7aR9Ku5uk1esBYTe65zu7821ywMrFH8H9v32CEWmI1Wygsy_K8hSc65w=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("腦筋急轉彎 (電影)");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/t5DZZmfjuI9hzdGFyRZ0pIiKSmlwGpSeLzPr4BlRIob-LmYml5tptzPEKLLCUx5Rqzw=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("Ted 2");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/rzFLef_4AxFNTb569Cx7ffIGcCq5Iiq0uaaDChH_VlC69oz5-xyR1eVsjV75lZPRk1zR=w300-rw");
        arrayList.add(itemObj);

        return arrayList;
    }

    public static ArrayList<ItemObj> getItemArrayList_15(){
        ArrayList<ItemObj> arrayList = new ArrayList<>();
        ItemObj itemObj = new ItemObj();
        itemObj.setName("中時電子報：視頻");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/GOQep_aQRpjGLviW7j-SSDBYLRrwGR5XLFoulk7IBr_aJ6KRa42SlqoRGAqx0J_9ntb2sJkp6g=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("天下雜誌");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/Q8ecMBdRVGEIbr-rYEZLQIqdLAQklO5e5WBT7hVDhXhJrZ5WQoUrdIAmlVt3KVgrnnhOJKNb=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("經理人月刊");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/ZBH7eXGTL9QhO6K6Zd2NhcidQrO_fUzttAOWpr0MF9eLT7aGkBrEQQf141PwW5mE-im1v_rsXA=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("ETtoday 東森新聞雲《政治版》");
        itemObj.setImageUrl("https://lh3.ggpht.com/CVN9rQ0aocaFI_pbFL3o8KQKs5f87DrFEz9uwHVdxb8ArTCrPX0VdUn4R1xDyYoP8HL8p3OwQfQ=w300-rw");
        arrayList.add(itemObj);
        itemObj = new ItemObj();
        itemObj.setName("udn.com");
        itemObj.setImageUrl("https://lh3.googleusercontent.com/Fy8kayEAr0kUbxFv0eYT6NSqpwle7LcIFESkje3Q3qrIbU57JycUAXCStMCOjZ-_BUTt6lHHfD0=w300-rw");
        arrayList.add(itemObj);

        return arrayList;
    }

    public static ArrayList<String> getBannerArrayList_1(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("https://lh3.googleusercontent.com/B902qZL8C6VDg2OA1R_DvJ4l5VcMSrU42RmuOpI5D2s_kCQWpo9cfErh59uwvRoD4QA=w515-rw");
        arrayList.add("https://lh3.googleusercontent.com/DiDbWqUt6WTJIuXffvTn0ZLogbZfgz2czBKL0cR-WMcydj0AyXd-9TkKBPFVSQat96A=w515-rw");
        arrayList.add("https://lh3.googleusercontent.com/ANp-j4Mi6oCUp22o6rwR2hgCfDirFgyJ6BBqwJGygYL2KUT1WmY9NhLSfplDk2Qeyjca=w515-rw");
        arrayList.add("https://lh3.googleusercontent.com/oAhSOZBljC8RRAXKFrPTW36AQn5ENwzHNtILjFq0zLZEDl4jqKiHG3Oq11QGNQZszw=w515-rw");
        arrayList.add("https://lh3.googleusercontent.com/0Tyo7uQ0KDiaz-LkPiUEYQxZ9tp23RyB-qIC1pYla3AgMaAxhUcTCIJEb_sDvhgPDA=w515-rw");
        arrayList.add("https://lh3.googleusercontent.com/cY2fSbYBd23BGBqEv3hJSVwKuy214nrivO82aVwWvsTluY8aOHz-Z56MzKkSoYoLHw=w515-rw");
        arrayList.add("https://lh3.googleusercontent.com/SuZCdcDSTaEBzuLydk7scoKkBhsG-ZdAqcOqtCybBZTgT7M4fpQxmtkELyCAcZOU-_s=w515-rw");

        return arrayList;
    }

    public static ArrayList<String> getBannerArrayList_2(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("https://lh3.googleusercontent.com/193_SE6OXu4TDbXHvtuMhqfP0UrjAdoL0LE4Eiulj1PAK9csSNo8zDSYK0r31Q_QZRc=w515-rw");
        arrayList.add("https://lh3.googleusercontent.com/sggzA9bJP5W4bZ5r5ssfmFpVRhtGpQ_VhmrTwDQmXvk85Q9w6Tf6aACimvmgZQnFOWWD=w515-rw");
        arrayList.add("https://lh3.googleusercontent.com/r8qsCU39RFM6tEAZZprcY4qE5HUpu9L2OWfd_scc2n9vrRC0OT0BvL9vLI7FNomgXb4Y=w515-rw");
        arrayList.add("https://lh3.googleusercontent.com/8qdagolOSYOFCtlXnstULWCkOqsqm9q3lF7Qe8wKKKPGrPa2cXVAY-9hbv1AEShzYn8M=w515-rw");
        arrayList.add("https://lh3.googleusercontent.com/cHKHpRE1uJbkN-1rXj2lWsItYZuQlCnmmwmxh1Y4_4F132a1TNkSCfdu-HqileHRPw=w515-rw");
        arrayList.add("https://lh3.googleusercontent.com/1x_Z76XoSOn6MBLXsC-qJDZrysM0FILOe-U9zxDYtLbJ-WBihKYPtUZGUZMMnnr_YOY=w515-rw");
        arrayList.add("https://lh3.googleusercontent.com/QBr5B0BiVlY2kyRKV3COBLaHLesRl3fFAI4d5_cFvtIA6q7gZBpeX4Q_URycWC0nR_Q=w515-rw");

        return arrayList;
    }
}
