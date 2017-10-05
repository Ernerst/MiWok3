package com.example.ekasilabalexcdtb.miwok;

/**
 * Created by eKasiLab Alex CDTB on 2017/06/08.
 */

public class Word {
    private String mDefaultWord;
    private String mMiwokTranslation;
    private int mAudioResourceId;
    private int resourceId = NO_IMAGE_PROVIDED;
    private static  final int NO_IMAGE_PROVIDED = -1;




    public Word(String mDefaultWord, String mMiwokTranslation) {
        this.mDefaultWord = mDefaultWord;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public Word(String mDefaultWord, String mMiwokTranslation, int resourceId,int audioResourceId) {
        this.mDefaultWord = mDefaultWord;
        this.mMiwokTranslation = mMiwokTranslation;
        this.resourceId = resourceId;
        this.mAudioResourceId = audioResourceId;
    }

    public Word(String mDefaultWord, String mMiwokTranslation,int audioResourceId) {
        this.mDefaultWord = mDefaultWord;
        this.mMiwokTranslation = mMiwokTranslation;
        this.resourceId = resourceId;
        this.mAudioResourceId = audioResourceId;
    }

    public String getmDefaultWord() {
        return mDefaultWord;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getResourceId() {
        return resourceId;
    }
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public  boolean hasImage(){

        return  resourceId != NO_IMAGE_PROVIDED;
    }
}
