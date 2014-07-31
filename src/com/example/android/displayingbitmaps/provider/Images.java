/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.displayingbitmaps.provider;

/**
 * Some simple test data to use for this sample app.
 */
public class Images {

    /**
     * This are PicasaWeb URLs and could potentially change. Ideally the PicasaWeb API should be
     * used to fetch the URLs.
     *
     * Credit to Romain Guy for the photos:
     * http://www.curious-creature.org/
     * https://plus.google.com/109538161516040592207/about
     * http://www.flickr.com/photos/romainguy
     */
    public final static String[] imageUrls = new String[] {
			"http://www.51mai.com/shop/images_shop/32397/2013-07-20/27692013724033857792041.JPG", //那巴提威化
            "http://d6.yihaodianimg.com/N00/M01/3F/F6/CgMBmVFVlimAA-CgAAIAoC2tWDM55600.jpg",//Q版珍宝珠56支装
            "http://www.nestle.com.hk/brands/Sweet/Fruitips/PublishingImages/pastilles.jpg",//能得利糖
            "http://image.lingshi.com/images/20110312/A01342/detail/b2.JPG",//四洲紫菜 香港
            "http://gw1.alicdn.com/bao/uploaded/i3/16618028484677997/T16rYpFhXXXXXXXXXX_!!0-item_pic.jpg", //利宾纳黑加仑子6*200ML
            "http://www.tradeduck.com/uploads/20041_10201409.jpg",	//狮王牙膏
            "http://new-img.wdwd.com/user_files/14/youyoustore.wdwd.com/youyoustore.wdwd.com_1374385808977211372_gallery_321504_1826.jpg", //『首选』烤焗花生100g
            "http://d7.yihaodianimg.com/t1/2011/0823/221/108/2414813_600x600.jpg", //果仁世家什锦果仁
            "http://g.search1.alicdn.com/img/bao/uploaded/i4/i2/T1IH9iFrNdXXXXXXXX_!!0-item_pic.jpg_210x210.jpg", //Durio泰国榴莲夹心饼
    };

    /**
     * This are PicasaWeb thumbnail URLs and could potentially change. Ideally the PicasaWeb API
     * should be used to fetch the URLs.
     *
     * Credit to Romain Guy for the photos:
     * http://www.curious-creature.org/
     * https://plus.google.com/109538161516040592207/about
     * http://www.flickr.com/photos/romainguy
     */
    public final static String[] imageThumbUrls = new String[] {
			"http://www.51mai.com/shop/images_shop/32397/2013-07-20/27692013724033857792040.JPG", //那巴提威化        
    		"https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQhG-nfCYITfAQXDOik-zFMqQZv57wzKooZEVguDWgQd8EYBSxXqQ",//Q版珍宝珠56支装
            "http://www.fankeshop.com/images/cn/goods/big/201302191327582250.jpg",//能得利糖
            "http://www.ckf.com.hk/image/cache/data/nfs001a-500x500.jpg", //四洲紫菜 香港
            "http://gw1.alicdn.com/bao/uploaded/i3/16618028484677997/T16rYpFhXXXXXXXXXX_!!0-item_pic.jpg", //利宾纳黑加仑子6*200ML
            "http://img2.tejiawang.com/p_2/583/258/m_2583258_1.jpg", //狮王牙膏
            "http://new-img.wdwd.com/user_files/14/youyoustore.wdwd.com/youyoustore.wdwd.com_1374385808977211372_gallery_321504_1826.jpg", //『首选』烤焗花生100g
            "http://i03.c.aliimg.com/img/ibank/2013/057/370/996073750_1541695327.220x220.jpg", //果仁世家什锦果仁
            "http://g.search1.alicdn.com/img/bao/uploaded/i4/i2/T1IH9iFrNdXXXXXXXX_!!0-item_pic.jpg", //Durio泰国榴莲夹心饼
            
    };
    public final static String[] itemTitle = new String[] {
    	"那巴提威化", //那巴提威化        
		"Q版珍宝珠",//Q版珍宝珠56支装
        "能得利糖",//能得利糖
        "四洲紫菜 香港", //四洲紫菜 香港
        "利宾纳黑加仑子200ML", //利宾纳黑加仑子6*200ML
        "狮王牙膏", //狮王牙膏
        "『首选』烤焗花生100g", //『首选』烤焗花生100g
        "果仁世家什锦果仁", //果仁世家什锦果仁
        "Durio泰国榴莲夹心饼", //Durio泰国榴莲夹心饼
    };
    public final static String[] imagePrice = new String[] {
    	"1元1小包，剩0包", //那巴提威化        
		"5毛一支，若干",//Q版珍宝珠56支装
        "22元1条，剩1条",//能得利糖
        "12元1包，剩1包", //四洲紫菜 香港
        "3元1盒，剩3盒", //利宾纳黑加仑子6*200ML
        "6.4一盒，剩3盒", //狮王牙膏
        "7元1包，剩0包", //『首选』烤焗花生100g
        "10元100g，剩200g", //果仁世家什锦果仁
        "6元1包，剩0包", //Durio泰国榴莲夹心饼

    	
    };
}
