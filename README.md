#  Java Polymorphism

### Proje Kurulumu

Projeyi öncelikle forklayın ve clone edin.
Daha sonra projeyi IntellijIDEA kullanarak açınız. README.md dosyasını dikkatli bir şekilde okuyarak istenenleri yapmaya çalışın.
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

### Intro

Polymorphism çok biçimlilik demektir. Java'nın ve Nesne Tabanlı Programlama'nın en önemli konularından biridir.
Java Polymorphism'in üzerine kurulmuş bir programlama dilidir. Bundan sonra göreceğimiz tüm konularda karşımıza çıkıcak ve Java'nın bel kemiğini oluşturacak.
Polymorphism soyut bir kavram olduğu için tam olarak nasıl çalıştığını anlamak biraz zaman alabilir. Kısaca Runtime anında objelerin davranış şekillerini değiştirme olarak özetleyebiliriz.


### Hedeflerimiz:

 ### Pacific com.workintech.pacificCarCompany.Car Company

 * Bugün ki projemizde toplamda 4 tane sınıf oluşturman istenmektedir.
 * İlk sınıfımız ```com.workintech.pacificCarCompany.Car``` isimli sınıfmız olmalı.
 * ```com.workintech.pacificCarCompany.Car``` sınıfı diğer oluşturacağımız 3 sınıf olan ```com.workintech.pacificCarCompany.Mitsubishi```, ```com.workintech.pacificCarCompany.Holden```, ```com.workintech.pacificCarCompany.Ford``` sınıflarının parent sınıf olacak.
   * ```com.workintech.pacificCarCompany.Car``` sınıfı 4 adet ```instance variable``` içermeli.
        
        engine => boolean
   
        cylinders => int
   
        name => String
   
        wheels => int
   
   * Bu 4 değişkende ```private``` olarak tanımlanmalı
   * com.workintech.pacificCarCompany.Car sınıfı için tek bir ```constructor``` tanımlanmalı. Constructor sadece 2 değeri dışarıdan almalı cylinders ve name değerlerini. İlgili 3 arabanın da motoru bulunduğu için ve 4 tekeri olduğu için contructor metodu içerisinde bu değerler default olarak set edilmeli. Dışarıdan parametre olarak alınmaya ihtiyaç duyulmamalı.
   * name ve cylinders parametreleri için getter metodlarını tanımlayınız.
   * com.workintech.pacificCarCompany.Car sınıfı için toString ve equals methodlarını da ```Override``` etmelisin. Equals metodu için name ve cylinders alanları birlikte eşitliği kontrol etmeli.
   * com.workintech.pacificCarCompany.Car sınıfı içerisinde aşağıdaki 3 metod tanımlanmalı
   * ```startEngine()``` hiçbir parametre almayacak ```the car's engine is starting``` mesajını dönmeli.
   * ```accelerate()```  hiçbir parametre almayacak ```the car is accelerating``` mesajını dönmeli.
   * ```brake()``` hiçbir parametre almayacak ```the car is braking``` mesajını dönmeli.
   * Ayrıca bu 3 metodunda içerisinde ```getClass().getSimpleName()``` değeri loglanmalı.
   * ```com.workintech.pacificCarCompany.Mitsubishi```, ```com.workintech.pacificCarCompany.Holden```, ```com.workintech.pacificCarCompany.Ford``` sınıfları ```com.workintech.pacificCarCompany.Car``` sınıfının alt sınıflarıdır ve bu 3 metoduda ```Override``` etmeliler.

Aşağıdaki gibi bir input değeri için output kısmında her araç türünün kendi override edilmiş metodunun çağırıldığından emin olmalısın.

 ### com.workintech.pacificCarCompany.Car R&D Company

 * 'com.workintech.pacificCarCompany.Car R&D Company' 3 farklı arabalarının dizaynını yapabilmek için yardıma ihtiyaç duyuyorlar. Bu konuda sana güvenleri tam. Problemlerini çözebilmen için seni işe aldılar.
 * ```CarSkeleton``` isminde bir sınıf tanımlayınız. ```name ve description``` alanlarını almalı.
 * ```CarSkeleton``` sınıfının 3 adet metodu olmalı. ```startEngine(), drive(), runEngine()``` startEngine ve drive metodları public olarak tanımlanmalı. runEngine protected olarak tanımlanmalı.
 * runEngine metodu drive metodunun içerisinden çağırılmalı.
 * ```CarSkeleton``` sınıfının 3 tane de ```subclass``` değeri tanımlanmalı. ```GasPoweredCar```, ```ElectricCar```, ```HybridCar```
 * ```GasPoweredCar``` iki sınıf değişkeni içerir. ```avgKmPerLitre: double ve cylinders: int```
 * ```ElectricCar``` iki sınıf değişkeni içerir. ```avgKmPerCharge: double ve batterySize: int```
 * ```HybridCar``` üç sınıf değişkeni içerir. ```avgKmPerLitre: double, batterySize: int, cylinders: int```
 * Bu üç farklı sınıfta ```startEngine ve drive``` metodlarını engine(motor) tiplerine göre farklı şekillerde çağırırlar.
 * Tüm dizaynı yapmak senin görevin. Alt sınıflar ```CarSkeleton``` içerisindeki bazı metodları ya da hepsini Override etmeli mi ?
 * Bir adet Main sınıfı tanımlayınız ve tüm sınıfların objelerinden polymorphism kurallarına uyacak şekilde birer instance oluşturunuz.
 * Her instance ile sınıfın davranışını test edin. Bir tane metodunuz sınıfın tipini ekrana basmalı.

### INPUT

com.workintech.pacificCarCompany.Car car = new com.workintech.pacificCarCompany.Car(8, "Base car");

System.out.println(car.startEngine());

System.out.println(car.accelerate());

System.out.println(car.brake());

com.workintech.pacificCarCompany.Car mitsubishi = new com.workintech.pacificCarCompany.Mitsubishi(6, "Outlander VRX 4WD");

System.out.println(mitsubishi.startEngine());

System.out.println(mitsubishi.accelerate());

System.out.println(mitsubishi.brake());

com.workintech.pacificCarCompany.Car ford = new com.workintech.pacificCarCompany.Ford(6, "com.workintech.pacificCarCompany.Ford Falcon");

System.out.println(ford.startEngine());

System.out.println(ford.accelerate());

System.out.println(ford.brake());

com.workintech.pacificCarCompany.Car holden = new com.workintech.pacificCarCompany.Holden(6, "com.workintech.pacificCarCompany.Holden Commodore");

System.out.println(holden.startEngine());

System.out.println(holden.accelerate());

System.out.println(holden.brake());
