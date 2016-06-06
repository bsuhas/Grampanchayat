package com.grampanchayat.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by SUHAS on 04/06/2016.
 */
public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Grampanchayat.db";

    public String GRAMPANCHAYAT_DETAIL_TABLE_NAME = "Grampanchayat_details";
    public String FINANCIAL_YEAR_MASTER_TABLE_NAME = "Financial_YearMaster";
    public String GRAMPANCHAYAT_LANDTAX_TABLE_NAME = "Grampanchayat_LandTax";
    public String GRAMPANCHAYAT_TAX_TABLE_NAME = "Grampanchayat_Tax";
    public String PROPERTY_DETAIL_TABLE_NAME = "Property_Detail";
    public String PROPERTY_OWNER_DETAIL_TABLE_NAME = "Property_Owner_Detail";
    public String TAX_DETAIL_TABLE_NAME = "Tax_Detail";

    //GRAMPANCHAYAT_DETAIL_TABLE_NAME
    public String GRAMPANCHAYAT_COLUMN_ID = "id";
    public String GRAMPANCHAYAT_COLUMN_GRAMPANCHAYAT_NAME = "gpname";
    public String GRAMPANCHAYAT_COLUMN_GRAMPANCHAYAT_ID = "gpid";
    public String GRAMPANCHAYAT_COLUMN_PANCHAYAT_SAMITI_NAME = "psname";
    public String GRAMPANCHAYAT_COLUMN_PANCHAYAT_SAMITI_ID = "psid";
    public String GRAMPANCHAYAT_COLUMN_DISTRICT_NAME = "distname";
    public String GRAMPANCHAYAT_COLUMN_DISTRICT_ID = "distid";
    public String GRAMPANCHAYAT_COLUMN_USER_NAME = "username";
    public String GRAMPANCHAYAT_COLUMN_USER_ID = "userid";

    //Financial_YearMaster
    public String FINANCIAL_YEAR_MASTER_COLUMN_YEAR_ID = "YearId";
    public String FINANCIAL_YEAR_MASTER_COLUMN_STARTDATE = "StartDate";
    public String FINANCIAL_YEAR_MASTER_COLUMN_ENDDATE = "EndDate";
    public String FINANCIAL_YEAR_MASTER_COLUMN_ISCURRENT = "IsCurrent";
    public String FINANCIAL_YEAR_MASTER_COLUMN_ISLASTYEAR = "IsLastYear";

    //Grampanchayat_LandTax
    public String GRAMPANCHAYAT_LANDTAX_COLUMN_ID = "id";
    public String GRAMPANCHAYAT_LANDTAX_COLUMN_GRAMPANCHAYAT_ID = "gpid";
    public String GRAMPANCHAYAT_LANDTAX_COLUMN_PANCHAYAT_SAMITI_ID = "psid";
    public String GRAMPANCHAYAT_LANDTAX_COLUMN_LANDTYPE = "land_type";
    public String GRAMPANCHAYAT_LANDTAX_COLUMN_YEARRATE = "year_rate";
    public String GRAMPANCHAYAT_LANDTAX_COLUMN_YEARID = "year_id";
    public String GRAMPANCHAYAT_LANDTAX_COLUMN_ACTIVE = "active";

    //GRAMPANCHAYAT_TAX_TABLE_NAME
    public String GRAMPANCHAYAT_TAX_COLUMN_ID = "id";
    public String GRAMPANCHAYAT_TAX_COLUMN_GRAMPANCHAYAT_ID = "gpid";
    public String GRAMPANCHAYAT_TAX_COLUMN_PANCHAYAT_SAMITI_ID = "psid";
    public String GRAMPANCHAYAT_TAX_COLUMN_TYPE = "type";
    public String GRAMPANCHAYAT_TAX_COLUMN_SUBTYPE = "subtype";
    public String GRAMPANCHAYAT_TAX_COLUMN_SQFR = "sqfr";
    public String GRAMPANCHAYAT_TAX_COLUMN_SQTO = "sqto";
    public String GRAMPANCHAYAT_TAX_COLUMN_GPRATE = "gprate";
    public String GRAMPANCHAYAT_TAX_COLUMN_YRATE = "yrate";
    public String GRAMPANCHAYAT_TAX_COLUMN_YEARID = "yearid";
    public String GRAMPANCHAYAT_TAX_COLUMN_ACTIVE = "active";

    //PROPERTY_DETAIL_TABLE_NAME
    public String PROPERTY_DETAIL_COLUMN_ID = "id";
    public String PROPERTY_DETAIL_COLUMN_GPID = "gpid";
    public String PROPERTY_DETAIL_COLUMN_PSID = "psid";
    public String PROPERTY_DETAIL_COLUMN_RID = "rid";
    public String PROPERTY_DETAIL_COLUMN_MMNO = "mmno";
    public String PROPERTY_DETAIL_COLUMN_HTYPE = "htype";
    public String PROPERTY_DETAIL_COLUMN_LENGTH = "length";
    public String PROPERTY_DETAIL_COLUMN_WIDTH = "width";
    public String PROPERTY_DETAIL_COLUMN_AREA = "area";
    public String PROPERTY_DETAIL_COLUMN_ADDRESS = "address";
    public String PROPERTY_DETAIL_COLUMN_WARD = "ward";
    public String PROPERTY_DETAIL_COLUMN_VYAVSAIK = "vyavsaik";
    public String PROPERTY_DETAIL_COLUMN_USRRENT = "user_rent";
    public String PROPERTY_DETAIL_COLUMN_RENT = "rent";
    public String PROPERTY_DETAIL_COLUMN_MMTYPE = "mmtype";
    public String PROPERTY_DETAIL_COLUMN_SRVNO = "srvno";
    public String PROPERTY_DETAIL_COLUMN_HNO = "hno";
    public String PROPERTY_DETAIL_COLUMN_SRNO = "srno";
    public String PROPERTY_DETAIL_COLUMN_MAGE = "mage";
    public String PROPERTY_DETAIL_COLUMN_MYEAR = "myear";
    public String PROPERTY_DETAIL_COLUMN_USAGE = "usage";
    public String PROPERTY_DETAIL_COLUMN_YEARID = "yearid";
    public String PROPERTY_DETAIL_COLUMN_ACTIVE = "active";


    //PROPERTY_OWNER_DETAIL_TABLE_NAME
    public String PROPERTY_OWNER_DETAIL_COLUMN_ID = "id";
    public String PROPERTY_OWNER_DETAIL_COLUMN_GPID = "gpid";
    public String PROPERTY_OWNER_DETAIL_COLUMN_PSID = "psid";
    public String PROPERTY_OWNER_DETAIL_COLUMN_RID = "rid";
    public String PROPERTY_OWNER_DETAIL_COLUMN_MM = "mm";
    public String PROPERTY_OWNER_DETAIL_COLUMN_NAME = "name";
    public String PROPERTY_OWNER_DETAIL_COLUMN_ADDRESS = "address";
    public String PROPERTY_OWNER_DETAIL_COLUMN_WIFE = "wife";
    public String PROPERTY_OWNER_DETAIL_COLUMN_MOB = "mob";
    public String PROPERTY_OWNER_DETAIL_COLUMN_YEARID = "yearid";
    public String PROPERTY_OWNER_DETAIL_COLUMN_ACTIVE = "active";

    //TAX_DETAIL_TABLE_NAME
    public String TAX_DETAIL_COLUMN_ID = "id";
    public String TAX_DETAIL_COLUMN_GPID = "gpid";
    public String TAX_DETAIL_COLUMN_PSID = "psid";
    public String TAX_DETAIL_COLUMN_HEALTH = "health";
    public String TAX_DETAIL_COLUMN_LIGHT = "light";
    public String TAX_DETAIL_COLUMN_WATER = "water";
    public String TAX_DETAIL_COLUMN_LANDTYPE = "land_type";
    public String TAX_DETAIL_COLUMN_HECTOR = "hector";
    public String TAX_DETAIL_COLUMN_SQMTR = "sqmtr";
    public String TAX_DETAIL_COLUMN_DISCOUNT = "discount";
    public String TAX_DETAIL_COLUMN_ROAD = "road";
    public String TAX_DETAIL_COLUMN_OLDHOME = "old_home";
    public String TAX_DETAIL_COLUMN_RATETYPE = "rate_type";
    public String TAX_DETAIL_COLUMN_YEARID = "year_id";
    public String TAX_DETAIL_COLUMN_MMNO = "mmno";
    public String TAX_DETAIL_COLUMN_ACTIVE = "active";

    private static DBHelper mInstance;

    public DBHelper(Context context) {
        //TODO UPADTE db VERSION IN NEXT RELEASE
        super(context, DATABASE_NAME, null, 1);
    }

    public static DBHelper getInstance(Context context) {
        if (mInstance == null)
            mInstance = new DBHelper(context);

        return mInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        String GRAMPANCHAYAT_DETAIL_TABLE = "CREATE TABLE " + GRAMPANCHAYAT_DETAIL_TABLE_NAME + "("
                + GRAMPANCHAYAT_COLUMN_ID + " INTEGER PRIMARY KEY,"
                + GRAMPANCHAYAT_COLUMN_GRAMPANCHAYAT_NAME + " TEXT,"
                + GRAMPANCHAYAT_COLUMN_GRAMPANCHAYAT_ID + " TEXT,"
                + GRAMPANCHAYAT_COLUMN_PANCHAYAT_SAMITI_NAME + " TEXT,"
                + GRAMPANCHAYAT_COLUMN_PANCHAYAT_SAMITI_ID + " TEXT,"
                + GRAMPANCHAYAT_COLUMN_DISTRICT_NAME + " TEXT,"
                + GRAMPANCHAYAT_COLUMN_DISTRICT_ID + " TEXT,"
                + GRAMPANCHAYAT_COLUMN_USER_NAME + " TEXT,"
                + GRAMPANCHAYAT_COLUMN_USER_ID + " TEXT " + ")";

        String FINANCIAL_YEAR_MASTER_TABLE = "CREATE TABLE " + FINANCIAL_YEAR_MASTER_TABLE_NAME + "("
                + FINANCIAL_YEAR_MASTER_COLUMN_YEAR_ID + " INTEGER PRIMARY KEY,"
                + FINANCIAL_YEAR_MASTER_COLUMN_STARTDATE + " TEXT,"
                + FINANCIAL_YEAR_MASTER_COLUMN_ENDDATE + " TEXT,"
                + FINANCIAL_YEAR_MASTER_COLUMN_ISCURRENT + " TEXT,"
                + FINANCIAL_YEAR_MASTER_COLUMN_ISLASTYEAR + " TEXT " + ")";

        String GRAMPANCHAYAT_LANDTAX_TABLE = "CREATE TABLE " + GRAMPANCHAYAT_LANDTAX_TABLE_NAME + "("
                + GRAMPANCHAYAT_LANDTAX_COLUMN_ID + " INTEGER PRIMARY KEY,"
                + GRAMPANCHAYAT_LANDTAX_COLUMN_GRAMPANCHAYAT_ID + " TEXT,"
                + GRAMPANCHAYAT_LANDTAX_COLUMN_PANCHAYAT_SAMITI_ID + " TEXT,"
                + GRAMPANCHAYAT_LANDTAX_COLUMN_LANDTYPE + " TEXT,"
                + GRAMPANCHAYAT_LANDTAX_COLUMN_YEARRATE + " TEXT,"
                + GRAMPANCHAYAT_LANDTAX_COLUMN_YEARID + " TEXT,"
                + GRAMPANCHAYAT_LANDTAX_COLUMN_ACTIVE + " TEXT " + ")";


        String GRAMPANCHAYAT_TAX_TABLE = "CREATE TABLE " + GRAMPANCHAYAT_TAX_TABLE_NAME + "("
                + GRAMPANCHAYAT_TAX_COLUMN_ID + " INTEGER PRIMARY KEY,"
                + GRAMPANCHAYAT_TAX_COLUMN_GRAMPANCHAYAT_ID + " TEXT,"
                + GRAMPANCHAYAT_TAX_COLUMN_PANCHAYAT_SAMITI_ID + " TEXT,"
                + GRAMPANCHAYAT_TAX_COLUMN_TYPE + " TEXT,"
                + GRAMPANCHAYAT_TAX_COLUMN_SUBTYPE + " TEXT,"
                + GRAMPANCHAYAT_TAX_COLUMN_SQFR + " TEXT,"
                + GRAMPANCHAYAT_TAX_COLUMN_SQTO + " TEXT,"
                + GRAMPANCHAYAT_TAX_COLUMN_GPRATE + " TEXT,"
                + GRAMPANCHAYAT_TAX_COLUMN_YRATE + " TEXT,"
                + GRAMPANCHAYAT_TAX_COLUMN_YEARID + " TEXT,"
                + GRAMPANCHAYAT_TAX_COLUMN_ACTIVE + " TEXT " + ")";

        String PROPERTY_DETAIL_TABLE = "CREATE TABLE " + PROPERTY_DETAIL_TABLE_NAME + "("
                + PROPERTY_DETAIL_COLUMN_ID + " INTEGER PRIMARY KEY,"
                + PROPERTY_DETAIL_COLUMN_GPID + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_PSID + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_RID + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_MMNO + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_HTYPE + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_LENGTH + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_WIDTH + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_AREA + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_ADDRESS + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_WARD + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_VYAVSAIK + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_USRRENT + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_RENT + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_MMTYPE + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_SRVNO + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_HNO + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_SRNO + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_MAGE + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_MYEAR + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_USAGE + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_YEARID + " TEXT,"
                + PROPERTY_DETAIL_COLUMN_ACTIVE + " TEXT " + ")";


        String PROPERTY_OWNER_DETAIL_TABLE = "CREATE TABLE " + PROPERTY_OWNER_DETAIL_TABLE_NAME + "("
                + PROPERTY_OWNER_DETAIL_COLUMN_ID + " INTEGER PRIMARY KEY,"
                + PROPERTY_OWNER_DETAIL_COLUMN_GPID + " TEXT,"
                + PROPERTY_OWNER_DETAIL_COLUMN_PSID + " TEXT,"
                + PROPERTY_OWNER_DETAIL_COLUMN_RID + " TEXT,"
                + PROPERTY_OWNER_DETAIL_COLUMN_MM + " TEXT,"
                + PROPERTY_OWNER_DETAIL_COLUMN_NAME + " TEXT,"
                + PROPERTY_OWNER_DETAIL_COLUMN_ADDRESS + " TEXT,"
                + PROPERTY_OWNER_DETAIL_COLUMN_WIFE + " TEXT,"
                + PROPERTY_OWNER_DETAIL_COLUMN_MOB + " TEXT,"
                + PROPERTY_OWNER_DETAIL_COLUMN_YEARID + " TEXT,"
                + PROPERTY_OWNER_DETAIL_COLUMN_ACTIVE + " TEXT " + ")";

        String TAX_DETAIL_TABLE = "CREATE TABLE " + TAX_DETAIL_TABLE_NAME + "("
                + TAX_DETAIL_COLUMN_ID + " INTEGER PRIMARY KEY,"
                + TAX_DETAIL_COLUMN_GPID + " TEXT,"
                + TAX_DETAIL_COLUMN_PSID + " TEXT,"
                + TAX_DETAIL_COLUMN_HEALTH + " TEXT,"
                + TAX_DETAIL_COLUMN_LIGHT + " TEXT,"
                + TAX_DETAIL_COLUMN_WATER + " TEXT,"
                + TAX_DETAIL_COLUMN_LANDTYPE + " TEXT,"
                + TAX_DETAIL_COLUMN_HECTOR + " TEXT,"
                + TAX_DETAIL_COLUMN_SQMTR + " TEXT,"
                + TAX_DETAIL_COLUMN_DISCOUNT + " TEXT,"
                + TAX_DETAIL_COLUMN_ROAD + " TEXT,"
                + TAX_DETAIL_COLUMN_OLDHOME + " TEXT,"
                + TAX_DETAIL_COLUMN_RATETYPE + " TEXT,"
                + TAX_DETAIL_COLUMN_YEARID + " TEXT,"
                + TAX_DETAIL_COLUMN_MMNO + " TEXT,"
                + TAX_DETAIL_COLUMN_ACTIVE + " TEXT " + ")";

        db.execSQL(GRAMPANCHAYAT_DETAIL_TABLE);
        db.execSQL(FINANCIAL_YEAR_MASTER_TABLE);
        db.execSQL(GRAMPANCHAYAT_LANDTAX_TABLE);
        db.execSQL(GRAMPANCHAYAT_TAX_TABLE);
        db.execSQL(PROPERTY_DETAIL_TABLE);
        db.execSQL(PROPERTY_OWNER_DETAIL_TABLE);
        db.execSQL(TAX_DETAIL_TABLE);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(db);
    }

    public void initDB() {
        this.getReadableDatabase();
        this.getWritableDatabase();
    }
}
