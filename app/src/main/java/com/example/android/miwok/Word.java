package com.example.android.miwok;

/**
 * Created by Sean on 3/26/2017.
 */

public class Word {
    ///Default language translation for word
    private String mDefaultTranslation;

    /// Miwok translation for word
    private String mMiwokTranslation;

    /// int that stores image ID
    private int mImageResourceId = 0;

    ///Create a new Word object, assign default and Miwok translations
    public Word(String defaultWord, String miwokWord){
        mDefaultTranslation = defaultWord;
        mMiwokTranslation = miwokWord;
    }

    public Word(String defaultWord, String miwokWord, int imageResourceId){
        mDefaultTranslation = defaultWord;
        mMiwokTranslation = miwokWord;
        mImageResourceId = imageResourceId;
    }

    ///Get default translation
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    ///get miwok translation
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
}
