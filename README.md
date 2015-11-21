##([Руководство по Eclipse IDE](http://sotnyk.com/2011/10/09/rukovodstvo-po-eclipse-ide/) | [еще](http://www.bsu.by/Cache/pdf/508363.pdf)) [GWT - Tutorial](http://www.vogella.com/tutorials/GWT/article.html#overview_gwt)
* `Создание первой части GWT-приложения`:


1. Меняем структуру GWT-приложения: `архитектура веб-приложения: src='client','shared','server'; war='WEB-INF';` | `добавляем: 'RPC-сервис','Callback-функцию';` | `слушатели <ВИДЖЕТОВ> остаются в классе '< EntryPoint >', а обработчики <ВИДЖЕТОВ> переносим на серверную сторону '< RemoteServiceServlet >'` | `класс 'Callback-функции' вызывается из класса '< EntryPoint >', а внутри 'Callback-функции' делаем иннициализацию для <ВИДЖЕТА>`;
2. Такое GWT-приложение является уже клиент-серверным веб-приложением...

##GWT 2 Spring 3 JPA 2 Hibernate 3.5 Tutoria ([#1](http://www.javacodegeeks.com/2010/05/gwt-2-spring-3-jpa-2-hibernate-35-2.html) | [#2](http://www.javacodegeeks.com/2010/07/gwt-2-spring-3-jpa-2-hibernate-35.html))
