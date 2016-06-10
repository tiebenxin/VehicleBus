package com.google.zxing;

import com.google.zxing.common.BitMatrix;
import java.util.Hashtable;

public interface Writer {
    BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException;

    BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Hashtable hashtable) throws WriterException;
}