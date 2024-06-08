# SWLab-HW9

## JSON.simple

میزان test coverage را در پروژه Json.simple مطابق تصاویر زیر می‌توان مشاهده کرد.

<img width="1512" alt="image" src="https://github.com/kiarashk8128/SWLab-HW9/assets/62250863/b8fb4808-5a54-4dee-a8f2-1bcad3d963a6">

<img width="1512" alt="image" src="https://github.com/kiarashk8128/SWLab-HW9/assets/62250863/fa542ee2-f563-42f6-b1fd-ccd860ab4a19">

<img width="1512" alt="image" src="https://github.com/kiarashk8128/SWLab-HW9/assets/62250863/3d146c81-af32-4c08-80e4-ce85e4f55a65">

<img width="1512" alt="image" src="https://github.com/kiarashk8128/SWLab-HW9/assets/62250863/9784d304-86fb-4c6f-9bf1-12c521e3823b">

<img width="1512" alt="image" src="https://github.com/kiarashk8128/SWLab-HW9/assets/62250863/0db24be7-b9b6-499f-8627-942514efe47a">

## تمرین

قبل از ایجاد تغییرات، میزان coverage به صورت زیر است:

<img width="1512" alt="image" src="https://github.com/kiarashk8128/SWLab-HW9/assets/62250863/75137025-574a-4a4c-87ad-537d8d04f136">

مشاهده می‌شود که در تعدادی از کلاس‌ها، بخشی از متدها توسط تست پوشش داده نشده‌اند. در بخش بعدی سعی می‌شود تا بخشی از آنها پوشش داده شوند.

همان طور که در اسکرین‌شات قبلی واضح است، کلاسِ PersonRepository دارای coverage صفر است و تست‌های اولیه هیچ بخشی از کد را پوشش نمی‌دهند. فلذا تست‌های مربوط به کلاسِ PersonRepositoryTest را توسعه و گسترش می‌دهیم تا coverage افزایش یابد. کلاس تست مربوطه را می‌بینید:

![](https://github.com/kiarashk8128/SWLab-HW9/blob/main/images/photo_2024-06-08_11-03-43.jpg?raw=true)

![](https://github.com/kiarashk8128/SWLab-HW9/blob/main/images/photo_2024-06-08_11-03-59.jpg?raw=true)

همان‌طور که می‌بینید تست نهایی به coverage صد درصد می‌رسد، هم از نظر پوشش کلاس، هم پوشش متدها و هم خطوط کد:

![](https://github.com/kiarashk8128/SWLab-HW9/blob/main/images/photo_2024-06-08_11-04-06.jpg?raw=true)

در ادامه می‌خواهیم coverage کلاس‌های پکیجِ services را ببرسی کرده و افزایش دهیم. برای این کار متدهای تست کلاسِ PersonServiceTest را پیاده‌سازی می‌کنیم. اسکرین‌شات‌های زیر نمایشگر تست‌های پیاده‌سازی شده هستند:

![](https://github.com/kiarashk8128/SWLab-HW9/blob/main/images/photo_2024-06-08_11-58-02.jpg?raw=true)

![](https://github.com/kiarashk8128/SWLab-HW9/blob/main/images/photo_2024-06-08_11-58-09.jpg?raw=true)

![](https://github.com/kiarashk8128/SWLab-HW9/blob/main/images/photo_2024-06-08_11-58-17.jpg?raw=true)

این تست‌ها متدهایی مانند ایجاد یک Person، همچنین دریافت اطلاعات او و delete کردن و فانکشنالیتی‌هایی از این قبیل را تست می‌کنند.

در نهایت coverage کلاس‌های این پکیج به 100 درصد می‌رسد و تمامی متدها و خطوط کد پوشش داده می‌شوند. همچنین coverage در کلاس PersonalServiceImpl از مقدار اولیه خود بیشتر می‌شود. در اسکرین‌شات زیر coverage کلاس‌ها را می‌توانید ببینید:
![](https://github.com/kiarashk8128/SWLab-HW9/blob/main/images/photo_2024-06-08_11-58-23.jpg?raw=true)
