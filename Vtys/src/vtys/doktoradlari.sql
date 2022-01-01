CREATE DEFINER='root'@'localhost' PROCEDURE 'doktorAdlariniGetir' (IN doktorid INT)
BEGIN
SELECT randevu_id,doktor_adi,doktor_soyadi,klinik_adi,randevu_saat,randevu_tarih, from randevular inner join doktorlar on randevular.doktor_id=doktorlar.doktor_id
INNER JOİN klinikler on klinikler.klinik_id=doktorlar.klinik_id where randevular.hasta_id=@doktorlarid
END

