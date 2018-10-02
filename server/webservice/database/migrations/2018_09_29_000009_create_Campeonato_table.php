<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateCampeonatoTable extends Migration
{
    /**
     * Schema table name to migrate
     * @var string
     */
    public $set_schema_table = 'Campeonato';

    /**
     * Run the migrations.
     * @table Campeonato
     *
     * @return void
     */
    public function up()
    {
        if (Schema::hasTable($this->set_schema_table)) return;
        Schema::create($this->set_schema_table, function (Blueprint $table) {
            $table->engine = 'InnoDB';
            $table->increments('campeonatoid');
            $table->unsignedInteger('divisionid')->nullable();
            $table->integer('ano')->nullable();
            $table->string('nombre', 120)->nullable();
            $table->string('semestre', 45)->nullable();
            $table->unsignedInteger('campeon')->nullable();
            $table->date('fecha_inicio')->nullable();
            $table->date('fecha_termino')->nullable();
            $table->string('reglamento', 120)->nullable();

            $table->index(["divisionid"], 'divisionid_idx');

            $table->index(["campeon"], 'campeon_idx');

            $table->unique(["campeonatoid"], 'ligaid_UNIQUE');


            $table->foreign('campeon', 'campeon_idx')
                ->references('equipoid')->on('Equipo')
                ->onDelete('no action')
                ->onUpdate('no action');

            $table->foreign('divisionid', 'divisionid_idx')
                ->references('divisionid')->on('Division')
                ->onDelete('no action')
                ->onUpdate('no action');
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
     public function down()
     {
       Schema::dropIfExists($this->set_schema_table);
     }
}
