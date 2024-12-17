from typing import Final
from telegram import Update
from telegram.ext import Application, CommandHandler,MessageHandler,filters, ContextTypes


TOKEN : Final = '7689330512:AAFOWIoAd4BsCYCDYtSo7klTcZOhIZ21T0I'
BOT_USERNAME: Final = '@Xpression_Xpressions_Bot'

#Commands
async def start_command(update: Update, context: ContextTypes.DEFAULT_TYPE):
    await update.message.reply_text("Hello, welcome to Xpressions! Thank you for chatting")

async def help_command(update: Update, context: ContextTypes.DEFAULT_TYPE):
    await update.message.reply_text("I crave to help, Please what can i help you with?")

async def custom_command(update: Update, context: ContextTypes.DEFAULT_TYPE):
    await update.message.reply_text("This is a custom command!")


#Responses

def handle_responses(text : str) -> str:
    processed : str = text.lower()

    if 'hello' in processed:
        return 'Hey there, how can i help you today?! 😊'
    if 'how are you' in processed:
        return 'I am having a splendid day, i bet yours is great ?'
    if 'yes'in processed:
        return 'Great!'
    if 'i need urgent 2k' in processed:
        return 'The Lord Is Your Strength'
    if 'i need help' in processed:
        return 'Hang in there Champ!! Do not give up!!'
    if 'thank you' in processed:
        return 'You are always welcome!'
    if 'i need your help' in processed:
        return 'What could that be, hope you are alright?'
    else:
        return "I don't understand what you wrote, I am just a bot>>>>>"



async def handle_message(update: Update, context: ContextTypes.DEFAULT_TYPE):
    message_type: str = update.message.chat.type
    text: str = update.message.text

    print(f'User ({update.message.chat.id}) in {message_type} : "{text}"')

    if message_type == 'group':
        if BOT_USERNAME in text:
            new_text : str = text.replace(BOT_USERNAME, '').strip()
            response : str =  handle_responses(new_text)
        else:
            return
    else:
        response : str  = handle_responses(text)

    print ('Bot:', response)
    await update.message.reply_text(response)


async def error(update: Update, context: ContextTypes.DEFAULT_TYPE):
    print(f'Update {update} caused error {context.error}')


if __name__ == '__main__':
    print("Starting Bot>>>>>>")
    app = Application.builder().token(TOKEN).build()

    #Commands
    app.add_handler(CommandHandler("start",start_command))
    app.add_handler(CommandHandler("help",help_command))
    app.add_handler(CommandHandler("custom",custom_command))

    #Messages
    app.add_handler(MessageHandler(filters.TEXT, handle_message))

    #Errors
    app.add_error_handler(error)

    print("Polling>>>>>")
    app.run_polling(poll_interval=3)