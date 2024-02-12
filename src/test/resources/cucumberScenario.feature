#language: ru

@all
Функционал: Оформление заявки

  @firstTest
  Сценарий: Оформление заявки на командировку
    * Пройти авторизацию: водим логин "Sekretar Kompanii" и пароль "testing"
    * Проверить наличие на странице заголовка Панель быстрого запуска
    * В выплывающем окне раздела Расходы нажать на Командировки
    * Нажать на  Создать командировку
    * На странице создания командировки заполнить или выбрать поля
    * Проверить, что на странице появилось сообщение: Список командируемых сотрудников не может быть пустым