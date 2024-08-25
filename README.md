# Akakce-Case
Verilen case dosyası içerisinde yer alan soruların çözümlerini ve testleri bulabilirsiniz.

Soru 2'de yer alan UI Otomasyon için aşağıdaki kurulumlar yapılmalıdır :


1-Öncelikle NodeJs kurulumu yapılır. (https://nodejs.org/en/download/package-manager)
2-NodeJs kurulduktan sonra Cypress kurulur. ( npm install cypress — save-dev )
3-Testler Cypress'in dosya yapısına uygun olarak e2e klasörü altında yer alır ve yazılır.
4-npx cypress open komutu ile testler çalıştırılır.


Test Sonucu

Case'de belirtilen tüm adımlar test edilmiştir. Her bir adım ayrı bir test olarak düşünülmüş, ona uygun parçalanmıştır.
Son aşamada ürünün takip listesinde yer aldığı doğrulanmıştır. Describe komutu ile test suiti, it komutu ile test caseler yazılmıştır.


Soru 5'te yer alan Rest-Assured API Testi için aşağıdaki kurulumların yapılması gerekmektedir :

1- IntellijIDEA, java,sdk kurulumları yapılmalıdır.
2- Proje maven tipinde oluşturulmuştur.
3- Pom.xml dosyasına kullanılacak kütüphaneler eklenmiştir. (rest assured ve test doğrulamaları için testNG kullanılmıştır.)
4- Her bir test javac dosya adı.java komutu ile ya da testNG eklendiği için class yanında yer alan Ok işaretine basılarak run yapılabilir.
5-Test sonuçları ss olarak paylaşılmıştır.

Test Sonucu

Case'de verilen tüm sorular rest-assured ile yapılmış ve doğrulaması testNG frameworkü ile sağlanmıştır.